CREATE TABLE "StudentScholarshipTable" (
	"uid" INT,
	"Institute_name" VARCHAR2(255) NOT NULL,
	"present_course" VARCHAR2(255),
	"present_year" DATE NOT NULL,
	"mode_of_study" VARCHAR2(255) NOT NULL,
	"start_date" TIMESTAMP NOT NULL,
	"university_name" VARCHAR2(255) NOT NULL,
	"previous_course" VARCHAR2(255) NOT NULL,
	"previous_year" DATE NOT NULL,
	"previous_class_percent" DECIMAL NOT NULL,
	"father_name" VARCHAR2(255) NOT NULL,
	"mother_name" VARCHAR2(255) NOT NULL,
	"family_annual_income" INT NOT NULL,
	"10_roll_no" INT NOT NULL,
	"board_name" VARCHAR2(255) NOT NULL,
	"10_passing_year" DATE NOT NULL,
	"10_percent_obtained" INT NOT NULL,
	"10_percent_obtained" DECIMAL NOT NULL,
	"12_roll_no" INT NOT NULL,
	"12_board_name" VARCHAR2(255) NOT NULL,
	"12_passing_year" DATE NOT NULL,
	"12_percent_obtained" DECIMAL NOT NULL,
	"admission_fee" INT NOT NULL,
	"tution_fee" INT NOT NULL,
	"other_fee" INT,
	"type_of_disability" VARCHAR2(255) NOT NULL,
	"percent_of_disability" DECIMAL NOT NULL,
	"marital_status" VARCHAR2(255) NOT NULL,
	"parents_profession" VARCHAR2(255) NOT NULL,
	"state" VARCHAR2(255) NOT NULL,
	"district" VARCHAR2(255) NOT NULL,
	"address" VARCHAR2(255) NOT NULL,
	"pincode" INT NOT NULL,
	"scheme_applying" INT NOT NULL,
	"domicile_certificate" BLOB NOT NULL,
	"student_photograph" BLOB NOT NULL,
	"institue_idcard" BLOB NOT NULL,
	"caste_income_certificate" BLOB NOT NULL,
	"previous_year_certificate" BLOB NOT NULL,
	"fee_receipt" BLOB NOT NULL,
	"bank_passbook" BLOB NOT NULL,
	"aadhar_card" BLOB NOT NULL,
	"10_marksheet" BLOB NOT NULL,
	"12_marksheet" BLOB NOT NULL,
	"bonafide_certificate" BLOB);

CREATE sequence "STUDENTSCHOLARSHIPTABLE_UID_SEQ";

CREATE trigger "BI_STUDENTSCHOLARSHIPTABLE_UID"
  before insert on "StudentScholarshipTable"
  for each row
begin
  select "STUDENTSCHOLARSHIPTABLE_UID_SEQ".nextval into :NEW."uid" from dual;
end;

/
CREATE TABLE "Users" (
	"u_id" INT,
	"password" VARCHAR2(40) NOT NULL,
	"role" VARCHAR2(255) NOT NULL,
	"role_id" INT NOT NULL,
	constraint USERS_PK PRIMARY KEY ("u_id"));

CREATE sequence "USERS_U_ID_SEQ";

CREATE trigger "BI_USERS_U_ID"
  before insert on "Users"
  for each row
begin
  select "USERS_U_ID_SEQ".nextval into :NEW."u_id" from dual;
end;

/
CREATE TABLE "StudentRegistrationTable" (
	"state_domicile" VARCHAR2(255) NOT NULL,
	"name" VARCHAR2(255) NOT NULL,
	"gender" VARCHAR2(255) NOT NULL,
	"mobile" NUMBER(10, 0) NOT NULL,
	"email" VARCHAR2(255) NOT NULL,
	"institution" VARCHAR2(255) NOT NULL,
	"aadhar_no" NUMBER(12, 0) NOT NULL,
	"district" VARCHAR2(255) NOT NULL,
	"dob" DATE NOT NULL,
	"bank_ifsc" VARCHAR2(255) NOT NULL,
	"bank_account" INT NOT NULL,
	"bank_name" VARCHAR2(255) NOT NULL,
	"uid" INT NOT NULL,
	"password" VARCHAR2(40) NOT NULL,
	"student_id" INT UNIQUE NOT NULL,
	constraint STUDENTREGISTRATIONTABLE_PK PRIMARY KEY ("student_id"));

CREATE sequence "STUDENTREGISTRATIONTABLE_STUDENT_ID_SEQ";

CREATE trigger "BI_STUDENTREGISTRATIONTABLE_STUDENT_ID"
  before insert on "StudentRegistrationTable"
  for each row
begin
  select "STUDENTREGISTRATIONTABLE_STUDENT_ID_SEQ".nextval into :NEW."student_id" from dual;
end;

/
ALTER TABLE "StudentScholarshipTable" ADD CONSTRAINT "StudentScholarshipTable_fk0" FOREIGN KEY ("uid") REFERENCES "Users"("u_id");


ALTER TABLE "StudentRegistrationTable" ADD CONSTRAINT "StudentRegistrationTable_fk0" FOREIGN KEY ("uid") REFERENCES "Users"("u_id");

