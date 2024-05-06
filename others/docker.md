要在 Docker 中通过磁盘镜像安装和部署 Rocket.Chat 和 MongoDB，并允许通过外部网络访问，你可以按照以下步骤进行操作：

1. **下载 Rocket.Chat 和 MongoDB Docker 镜像**：首先，你需要下载 Rocket.Chat 和 MongoDB 的 Docker 镜像。你可以使用以下命令从 Docker Hub 下载这两个镜像：

- 下载 Rocket.Chat 镜像：

```bash
docker pull rocketchat/rocket.chat
```

- 下载 MongoDB 镜像：

```bash
docker pull mongo:4.0
```

2. **运行 MongoDB 容器**：首先，你需要运行 MongoDB 容器来作为 Rocket.Chat 的数据库。你可以使用以下命令来运行 MongoDB 容器：

```bash
docker run --name mongodb -d -v /path/to/mongodb/data:/data/db mongo:4.0
```

确保将 `/path/to/mongodb/data` 替换为你想要挂载的 MongoDB 数据目录。

3. **运行 Rocket.Chat 容器**：接下来，你可以运行 Rocket.Chat 容器并链接到 MongoDB 容器。确保指定适当的环境变量和端口映射以允许外部网络访问。你可以使用以下命令来运行 Rocket.Chat 容器：

```bash
docker run --name rocketchat -p 3000:3000 -d --env ROOT_URL=http://your_server_ip:3000 --env MONGO_URL=mongodb://mongodb:27017/rocketchat --link mongodb:mongodb rocketchat/rocket.chat
```

在上面的命令中：
- `--env ROOT_URL=http://your_server_ip:3000`：将 `your_server_ip` 替换为你的服务器的公共 IP 地址，以便从外部访问 Rocket.Chat。
- `--env MONGO_URL=mongodb://mongodb:27017/rocketchat`：指定 Rocket.Chat 使用的 MongoDB 连接 URL。
- `--link mongodb:mongodb`：将 Rocket.Chat 容器链接到 MongoDB 容器。

4. **配置防火墙和端口转发**：确保在服务器上配置防火墙，允许流量通过端口 `3000`（Rocket.Chat 默认端口）。如果服务器在云上，你还可能需要在云服务提供商的控制面板中配置网络规则。

5. **访问 Rocket.Chat**：一旦 Rocket.Chat 容器正在运行，你可以通过浏览器访问 `http://your_server_ip:3000` 来打开 Rocket.Chat 界面，并且可以通过外部网络访问。

通过以上步骤，你可以通过磁盘镜像在 Docker 中安装和部署 Rocket.Chat 和 MongoDB，并允许通过外部网络访问。如果有任何问题或需要进一步帮助，请随时告诉我。