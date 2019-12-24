# server4business


执行gradlew bootRun运行 端口8085

# 说明
以Entity结尾以及Request结尾的为实体类
以Handler结尾 (理论上应该叫Controller一开始写错了)的处理前端请求

Neworderhandler中前端发送信息在neworder对象中，可使用getter函数获取，return创建结果“true”或“false。

Orderlisthandler中无前端发送数据，将所有运单信息创建为对象(orderlistentity类)存入datalist中即可。

Searchorderhandler中前端请求在request对象中，可用getter获取，结果方法同上存入datalist。

Storagelisthandler中前端请求在storagenum中，可用getter获取仓库名，查询结果同上存入datalist

Infohandler同理。
