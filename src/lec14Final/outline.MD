#Java文件IO和Exception异常处理
## 文件 File
### 字符文件 Reader/Writer
- FileReader/FileWriter
- BufferdFileReader/BufferedFileWriter

### 字节文件
- FileInputStream /FileOutputStream
- BufferedFileOutput /BufferedOutputStream

### 高级IO
- Scanner
- PrintWriter

## 文件应用
### 读字符/字节文件
### 写字符/字节文件(追加覆盖模式)
### 文件拷贝(逐字符/字节,带缓冲区（默认8k)）
### 目录和遍历，文件夹拷贝 ，文件夹同步


## 异常处理机制
### throws 
### try catch finally
### 常用异常: Exception类的子类
- 数组越界
- 算术除0
- 文件不存在
- 文件无法写入
- 类型不可转化
- 空指针异常
- 格式错误

### 异常的应用
- 本地文件测试
- P1159 IP判断

### 可变字符串StringBuffer的应用