def tip_calculator():
    bill = float(input("Enter the total bill amount: "))
    tip_percentage = float(input("Enter the tip percentage: "))
    num_people = int(input("Enter the number of people: "))

    tip_amount = bill * (tip_percentage / 100)
    total_bill = bill + tip_amount
    bill_per_person = total_bill / num_people

    print("Total bill: ", total_bill)
    print("Bill per person: ", bill_per_person)

tip_calculator()