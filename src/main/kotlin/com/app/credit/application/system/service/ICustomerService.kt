package com.app.credit.application.system.service

import com.app.credit.application.system.entity.Customer

interface ICustomerService {
  fun save(customer: Customer): Customer
  fun findById(id: Long): Customer
  fun delete(id: Long)
}