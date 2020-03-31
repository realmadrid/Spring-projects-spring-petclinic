GROUP | PACKAGE | CLASS | INSTRUCTION_MISSED | INSTRUCTION_COVERED | BRANCH_MISSED | BRANCH_COVERED | LINE_MISSED | LINE_COVERED | COMPLEXITY_MISSED | COMPLEXITY_COVERED | METHOD_MISSED | METHOD_COVERED
--- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---
petclinic | org.springframework.samples.petclinic | PetClinicApplication | 8 | 0 | 0 | 0 | 3 | 0 | 2 | 0 | 2 | 0
petclinic | org.springframework.samples.petclinic.model | BaseEntity | 0 | 17 | 0 | 2 | 0 | 5 | 0 | 5 | 0 | 4
petclinic | org.springframework.samples.petclinic.model | NamedEntity | 0 | 13 | 0 | 0 | 0 | 5 | 0 | 4 | 0 | 4
petclinic | org.springframework.samples.petclinic.model | Person | 0 | 17 | 0 | 0 | 0 | 7 | 0 | 5 | 0 | 5
petclinic | org.springframework.samples.petclinic.vet | VetController | 37 | 0 | 0 | 0 | 10 | 0 | 3 | 0 | 3 | 0
petclinic | org.springframework.samples.petclinic.vet | Vet | 0 | 45 | 0 | 2 | 0 | 12 | 0 | 7 | 0 | 6
petclinic | org.springframework.samples.petclinic.vet | Specialty | 0 | 3 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1
petclinic | org.springframework.samples.petclinic.vet | Vets | 0 | 14 | 1 | 1 | 0 | 4 | 1 | 2 | 0 | 2
petclinic | org.springframework.samples.petclinic.visit | Visit | 0 | 27 | 0 | 0 | 0 | 12 | 0 | 7 | 0 | 7
petclinic | org.springframework.samples.petclinic.owner | VisitController | 51 | 0 | 2 | 0 | 16 | 0 | 6 | 0 | 5 | 0
petclinic | org.springframework.samples.petclinic.owner | Owner | 56 | 85 | 7 | 5 | 11 | 26 | 5 | 15 | 1 | 13
petclinic | org.springframework.samples.petclinic.owner | OwnerController | 144 | 0 | 10 | 0 | 36 | 0 | 14 | 0 | 9 | 0
petclinic | org.springframework.samples.petclinic.owner | PetType | 0 | 3 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1
petclinic | org.springframework.samples.petclinic.owner | PetTypeFormatter | 44 | 0 | 4 | 0 | 10 | 0 | 5 | 0 | 3 | 0
petclinic | org.springframework.samples.petclinic.owner | Pet | 5 | 66 | 1 | 1 | 1 | 21 | 1 | 11 | 0 | 11
petclinic | org.springframework.samples.petclinic.owner | PetController | 120 | 0 | 10 | 0 | 32 | 0 | 14 | 0 | 9 | 0
petclinic | org.springframework.samples.petclinic.owner | PetValidator | 34 | 7 | 8 | 0 | 9 | 2 | 5 | 2 | 1 | 2
petclinic | org.springframework.samples.petclinic.system | WelcomeController | 5 | 0 | 0 | 0 | 2 | 0 | 2 | 0 | 2 | 0
petclinic | org.springframework.samples.petclinic.system | CacheConfiguration | 19 | 0 | 0 | 0 | 5 | 0 | 4 | 0 | 4 | 0
petclinic | org.springframework.samples.petclinic.system | CrashController | 8 | 0 | 0 | 0 | 2 | 0 | 2 | 0 | 2 | 0

Instruction coverage: 297 / 828 (35.00 %)

Command run: mvn package -Dmaven.test.failure.ignore=true -Dtest='*DiffblueTest'
