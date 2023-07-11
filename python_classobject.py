from collections import Counter

class electric_car:
    level = 'High_end EV'
    level2 = 'Low_end EV'
    level3 = 'not EV'

    def __init__(self,brand,color):
        self.brand = brand
        self.color = color

    def performance(speed,mileage):
        if int(speed) <= 200 and int(mileage < 400):
            print('The car is slow and cannot go far')
        elif int(speed) > 200 and int(mileage < 400):
            print('The car is fast, but cannot go far')
        elif int(speed) <= 200 and int(mileage >= 400):
            print('The car is going slow, but can travel far away')
        elif int(speed)> 200 and int(mileage >= 400):
            print('A fast car it is, and it is superb for the mileage')
        else:
            print('throw the car away')


    def __str__(self):
        if self.brand == "tesla":
            return(f'The car you want to get from-- {self.brand} -- is {electric_car.level2}. The model is called Model 3, which is using lituium-ion battery')
        elif self.brand == "porsche":
            return(f'The car want to get from -- {self.brand} -- is {electric_car.level}, the battery is high-tech -- blader')
        else:
            return(f'The car is still running on petrol -- {electric_car.level3}, it is still using old-school engines')

EV = electric_car('porsche','red')
#electric_car.performance(101,200)
print(EV)


class Porsche:
    def __init__(self,country,location):
        self.country = country
        self.location = location
        self.factory_list = []
        self.price_list = []
        self.order_list = []
        self.client_list = []
        self.diff_list = {}
        self.temp_dic = {}

    def __str__(self):
        return (f'The center of the search is in {self.country}, which is one of the Porsche luxiours store that sells and display'
                f' their models in {self.location}.')

    def factory_stocks(self):
        self.factory_list = [{"911":150},{"Macan":275},{"Taycan":200},{"718":535}]
        return (f' The current factory stock is {self.factory_list}')

#per client order
    def customer_order(self,models,price):
        self.order_list.append({models:price})

    def conso_order(self):
        return self.order_list

    def projected_sales(self):
        total = 0
        for cars in self.order_list:
            for m,y in cars.items():
                total += y
        return (f' The projected sales will be ${total} based on clients latest orderings.' )

    def stocks_leftover(self):
        for order in self.order_list:
            for m,p in order.items():
                self.client_list.append(m)

        for models in self.factory_list:
            for k,v in models.items():
                self.temp_dic[k] = v

        counter_client = Counter(self.client_list)
        for k,v in self.temp_dic.items():
            if k in counter_client:
                self.diff_list[k] = v - counter_client[k]
            else:
                self.diff_list[k] = v

        return (f'The stock leftover (after sales) will be the followings ~ {self.diff_list}')

    def sales_revenue(self):
        total_sales = 0
        for car in self.order_list:
            for m,v in car.items():
                if m in list(self.temp_dic.keys()):
                    total_sales += v
        return (f'The actual sales will be ${total_sales} based on existing inventory')





porsche = Porsche('911', 2017)
print(porsche)

order1 = porsche.customer_order('911',180000)
order2 = porsche.customer_order('Taycan',160000)
order3_local = porsche.customer_order('911',185000)
order4_pre_order = porsche.customer_order('Caynene',142000)

print (porsche.conso_order())
print(porsche.projected_sales())
print(porsche.factory_stocks())
print(porsche.stocks_leftover())
print(porsche.sales_revenue())



class tesla(porsche):
    def __init__(self,model,year):
        pass