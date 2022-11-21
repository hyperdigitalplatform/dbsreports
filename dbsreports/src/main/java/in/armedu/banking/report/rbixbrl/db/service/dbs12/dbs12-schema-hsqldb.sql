
CREATE TABLE DBS12FilingInfo_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS12FilingInfo_Layout2Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS12DBS12_SectionA_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
        NameOfEntityAxis VARCHAR(255),
    
    
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS12DBS12_SectionB_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
        NameOfEntityAxis VARCHAR(255),
    
    
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS12DBS12_SectionC_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
        UniqueTransactionCodeAxis VARCHAR(255),
    
        NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis VARCHAR(255),
    
    
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS12DBS12_SectionD_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
        UniqueTransactionCodeAxis VARCHAR(255),
    
        NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis VARCHAR(255),
    
    
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS12DBS12_SectionD_Layout2Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
        UniqueTransactionCodeAxis VARCHAR(255),
    
        NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis VARCHAR(255),
    
        NameOfInterestedDirectorManagerAxis VARCHAR(255),
    
    
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS12DBSAuthorisedSignatory_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

