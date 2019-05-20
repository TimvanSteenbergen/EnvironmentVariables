ALTER TABLE "environmentvariables$tapurltext" ALTER COLUMN "letter" RENAME TO "environmenttype";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '4348a130-2fac-4fd2-9d7c-e28d5d52375f', 
"attribute_name" = 'EnvironmentType', 
"column_name" = 'environmenttype', 
"type" = 40, 
"length" = 1, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'c69fbf60-f158-4aae-8a59-3cac24e2dd2d';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20190519 23:14:58';
