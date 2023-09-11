如需要安装`build-essential`开发工具包，请以root用户或[具有sudo权限的用户](https://www.myfreax.com/how-to-create-a-sudo-user-on-ubuntu/)运行以下`apt`[命令](https://www.myfreax.com/how-to-use-apt-command/)：

```bash
sudo apt update
sudo apt install build-essential
```

该命令会安装很多软件开发者工具，包括`gcc`，`g++`和`make`以及常用c/c++的头文件。

除了安装c/c++开发者工具之外，您还可能需要安装GNU/Linux开发手册，这些手册页描述了Linux编程接口的说明。

如果你是Linux开发者可能需要这些文档，运行以下`apt`命令安装Linux编程接口的说明：

```bash
sudo apt-get install manpages-dev
```

至此，你已经完成gcc/g++开发工具的安装。

我们需要验证gcc/g++开发工具是否正确的安装，并检查gcc/g++的版本是否符号你要编写c/c++标准库的要求。

你可运行以下的`gcc`/`g++`命令打印GCC版本，验证GCC编译器是否已成功安装：

```bash
gcc --version
g++ --version
```