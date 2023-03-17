namespace java com.github.msr

struct TResults {
 1: list<list<string>> results
 2: optional list<string> schema
 3: optional string errorMessage
}

enum FileType {
    Json
    Csv
    Parquet
}

enum Delimiter {
    Comma
    Pipe
    Tab
}

struct ReadData {
   1: string path
   2: optional FileType dataType
   3: optional Delimiter delimiter
}

struct SQLStatment {
    1:string sql_statment
    2:optional string table_name
}

service SparkAPI {
    TResults exectureCommand(1: SQLStatment query)
    string readFile(1: ReadData file_to_read)
}