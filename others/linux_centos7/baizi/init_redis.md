虚拟机CentOS7上安装了redis，并且成功启动，在主机上无法连接。

1）修改redis.conf配置文件build
在配置文件redis.conf中，默认的bind 接口是127.0.0.1。
这样的话，访问redis服务只能通过本机的客户端连接，而无法通过远程连接，
如果bind选项为空的话，那会接受所有来自于可用网络接口的连接。
这里直接将bind注释掉。

2）关闭保护模式或者设置密码
修改redis.conf配置文件protected-mode模式。
不绑定ip也不设密码的话，redis是默认保护模式，只能本虚拟机访问。
这里为了省事直接将protected-mode模式关掉
protected-mode改为no
注意：为了安全最好不要关闭保护模式，最好配置密码。
修改密码方法：
找到requirepass，将前面的#去掉，requirepass后面的值改为自己的密码。

配置完成后，发现在主机上还是无法连接redis。
主机CMD命令Telnet redis的6379端口号，连接失败，说明端口不通，CentOS的6379端口没有开启。

开启CentOS的6379端口
输入firewall-cmd --query-port=6379/tcp，如果返回结果为no，那么证明6379端口确实没有开启。
输入firewall-cmd --add-port=6379/tcp，将6379端口开启，返回success。
然后再执行上一条命令，返回yes，证明端口已经成功开启。

原因：

由于linux防火墙默认开启，redis的服务端口6379并不在开放规则之内，所有需要将此端口开放访问或者关闭防火墙。

CentOS7使用firewalld打开关闭防火墙与端口

1、firewalld的基本使用

启动： systemctl start firewalld
关闭： systemctl stop firewalld
查看状态： systemctl status firewalld
开机禁用  ： systemctl disable firewalld
开机启用  ： systemctl enable firewalld

2.systemctl是CentOS7的服务管理工具中主要的工具，它融合之前service和chkconfig的功能于一体。

启动一个服务：systemctl start firewalld.service
关闭一个服务：systemctl stop firewalld.service
重启一个服务：systemctl restart firewalld.service
显示一个服务的状态：systemctl status firewalld.service
在开机时启用一个服务：systemctl enable firewalld.service
在开机时禁用一个服务：systemctl disable firewalld.service
查看服务是否开机启动：systemctl is-enabled firewalld.service
查看已启动的服务列表：systemctl list-unit-files|grep enabled
查看启动失败的服务列表：systemctl --failed

3.配置firewalld-cmd查看版本： firewall-cmd --version

查看帮助： firewall-cmd --help
显示状态： firewall-cmd --state
查看所有打开的端口： firewall-cmd --zone=public --list-ports
更新防火墙规则： firewall-cmd --reload
查看区域信息:  firewall-cmd --get-active-zones
查看指定接口所属区域： firewall-cmd --get-zone-of-interface=eth0
拒绝所有包：firewall-cmd --panic-on
取消拒绝状态： firewall-cmd --panic-off
查看是否拒绝： firewall-cmd --query-panic
 

那怎么开启一个端口呢

添加
firewall-cmd --zone=public --add-port=80/tcp --permanent    （--permanent永久生效，没有此参数重启后失效）
重新载入
firewall-cmd --reload
查看
firewall-cmd --zone= public --query-port=80/tcp
删除
firewall-cmd --zone= public --remove-port=80/tcp --permanent