package com.lihai.dao;

import com.lihai.entity.ConsumeRecord;

public interface ConsumeRecordDao {

    long addAndGetId(ConsumeRecord record);
}