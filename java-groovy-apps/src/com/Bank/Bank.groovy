package com.Bank
class Account {
    def interestRate=0
    def balance = 3000
    def name=""
    def accountid=123

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

saving.depositAmount(450)
saving.withdrawAmount(3000)
saving.checkBalance()
loan.withdrawAmount(2500)