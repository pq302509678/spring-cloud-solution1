#!/bin/bash
# Program: system_init_shell
# Author Kevin
msg=$1
if [ -n "$msg" ]; then
    cd /Users/iamwlb/Documents/Workspace/java/spring-cloud-solution1
    echo ' ' | sudo -S git add .
    echo ' ' | sudo -S git commit -m "${msg}"
    echo ' ' | sudo -S git push origin master
    echo -e "\033[32m[源码提交成功]\033[0m"
    echo "###############################################################"
else
    echo -e "\033[31m\033[01m 请添加注释再来一遍。格式如下： \033[0m"
    echo -e "\033[31m\033[01m $ ./publish.sh \"注释内容\" \033[0m"
fi