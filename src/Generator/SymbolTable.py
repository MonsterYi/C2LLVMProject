ERROR_REDEFINATION = "Type Redefination"  # 重定义


class SymbolTable:
    
    def __init__(self):
        self.dic_list = [{}]
        self.cur = 0

    def get_item(self, item):
        for i in range(self.cur, -1, -1):
            item_list = self.dic_list[i]
            if item in item_list:
                return item_list[item]
        return None
    
    def insert_item(self, key, val):
        if key in self.dic_list[self.cur]:
            return {"result": "fail", "reason": ERROR_REDEFINATION}
        self.dic_list[self.cur][key] = val
        return {'result': 'success'}

    def has_item(self, item):
        for i in range(self.cur, -1, -1):
            item_list = self.dic_list[i]
            if item in item_list:
                return True
        return False

    def func_enter(self):
        self.cur += 1
        self.dic_list.append({})

    def func_quit(self):
        if self.cur == 0:
            return
        self.dic_list.pop(-1)
        self.cur -= 1

    def is_global(self):
        if len(self.dic_list) == 1:
            return True
        else:
            return False
