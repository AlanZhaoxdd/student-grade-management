# 学生成绩管理系统（Spring Boot + Vue3）

本项目是一个前后端分离的学生成绩管理系统，使用 Spring Boot 作为后端框架，Vue3 + Element Plus 实现前端页面交互，MySQL 作为数据库。项目实现了基本的学生信息管理、课程管理、选课与成绩查看等功能。

---

## 🌟 项目功能

### 管理员端：
- 管理员登录
- 学生信息管理（增删改查）
- 课程信息管理
- 选课管理
- 成绩录入与查询
- 学生评价管理
- 修改密码

### 学生端：
- 注册 / 登录
- 课程信息查看与选课
- 成绩查询
- 课程评价
- 修改个人信息、密码

---

## 🛠️ 技术栈

| 层级     | 技术                  |
|----------|-----------------------|
| 后端     | Spring Boot, MyBatis |
| 数据库   | MySQL                |
| 前端     | Vue3, Element Plus   |
| 接口通信 | Axios                |
| 工具     | Postman, Git, GitHub |

---

## 🚀 项目运行方式

### 后端（Spring Boot）

```bash
cd springboot
# 用 IDE 启动 SpringbootApplication.java 或命令行运行
mvn spring-boot:run
```

### 前端（Vue3 + Vite）

```bash
cd vue
npm install
npm run dev
```

启动地址：http://localhost:5173

---

## 📝 项目进度

- [x] 初始化前后端目录结构及骨架  
- [x] 完成前端登录页面（Login.vue）的表单、样式和 UI 美化  
- [x] 添加登录页的路由配置（支持 `/login` 入口）  
- [x] 登录接口 /login 接入并完成后端验证逻辑
- [x] 添加首页欢迎页（Home.vue）组件，展示当前登录用户昵称
- [x] 添加登录背景图（bg.png）美化页面
- [ ] 后端学生/课程/成绩模块开发中

---
