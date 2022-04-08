package com.Bank
class Account {
    def interestRate = 0
    def balance
    def name
    def accountid

    //default constructor
    Account() {
        println "default constructor called"
        this.balance=3000
        this.name=''
        this.id = 123
    }

    //parametrised costructor
    Account(ID, Balance, Name) {
        println "parametrised constructor called"
        this.balance=Balance
        this.name=Name
        this.id = ID
    }


    def checkBalance() {
        println "the balance is " + this.balance
    }

    def depositAmount(amount) {
        this.balance+=amount
        println "amount deposited: $amount was successfull, new balance is" + this.balance

    }

    def withdrawAmount(amount) {
        if (this.balance >= amount) {
            this.balance-=amount
            println "amount deducted : $amount was successfull, new balance is "+this.balance
        }
        else {
            println "You have insufficient balance: "+this.balance
        }

    }
}

def saving = new Account()
def loan = new Account()

def loan1 = new Account(121, 6000, 'vijay')

// if no cnstructr is created, this will still automoatically invoke a parametrised constructor
def loan2 = new Account(name: 'manoj', balance: 2500, id: 231 )

saving.depositAmount(450)
saving.withdrawAmount(3000)
saving.checkBalance()
loan.withdrawAmount(2500)