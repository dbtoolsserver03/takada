### Ubuntu 安装ssh

在Ubuntu操作系统上安装ssh可以通过以下步骤进行：

1. 

   打开终端，以管理员权限运行以下命令来更新软件包列表：

   ```
   sudo apt-get update
   ```

2. 

   安装openssh-server软件包，它是SSH服务的服务器端实现：

   ```
   sudo apt-get install openssh-server
   ```

   

3. 

   安装完成后，SSH服务将自动启动。你可以通过以下命令来确认SSH服务的状态：

   ```
   sudo systemctl status ssh
   ```

   如果服务正在运行，终端会显示"active（running）"。

4. 

   在安装ssh期间，大多数情况下已经自动启用了SSHD（SSH守护程序），但如果需要手动启动或停止SSH服务，可以使用以下命令：

   ```
   sudo systemctl start ssh  # 启动SSH服务
   sudo systemctl stop ssh   # 停止SSH服务
   ```

   

   你还可以使用以下命令来重新启动SSH服务：

   ```
   sudo systemctl restart ssh
   ```

   

以上就是在Ubuntu上安装和配置SSH的步骤。请注意，安装和配置SSH可能需要使用管理员权限（sudo）执行相关命令。

如果你希望通过命令行连接到其他计算机或从其他计算机连接到你的Ubuntu计算机，你需要知道你的Ubuntu计算机的IP地址和SSH端口号。同时，你需要在你的防火墙（如ufw）中打开SSH端口。