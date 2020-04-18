GROUP | PACKAGE | CLASS | INSTRUCTION_MISSED | INSTRUCTION_COVERED | BRANCH_MISSED | BRANCH_COVERED | LINE_MISSED | LINE_COVERED | COMPLEXITY_MISSED | COMPLEXITY_COVERED | METHOD_MISSED | METHOD_COVERED
--- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---
petclinic | org.springframework.samples.petclinic | PetClinicApplication | 5 | 3 | 0 | 0 | 2 | 1 | 1 | 1 | 1 | 1
petclinic | org.springframework.samples.petclinic.model | BaseEntity | 2 | 15 | 1 | 1 | 0 | 5 | 1 | 4 | 0 | 4
petclinic | org.springframework.samples.petclinic.model | NamedEntity | 3 | 10 | 0 | 0 | 1 | 4 | 1 | 3 | 1 | 3
petclinic | org.springframework.samples.petclinic.model | Person | 0 | 17 | 0 | 0 | 0 | 7 | 0 | 5 | 0 | 5
petclinic | org.springframework.samples.petclinic.vet | VetController | 37 | 0 | 0 | 0 | 10 | 0 | 3 | 0 | 3 | 0
petclinic | org.springframework.samples.petclinic.vet | Vet | 42 | 3 | 2 | 0 | 11 | 1 | 6 | 1 | 5 | 1
petclinic | org.springframework.samples.petclinic.vet | Specialty | 0 | 3 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1
petclinic | org.springframework.samples.petclinic.vet | Vets | 14 | 0 | 2 | 0 | 4 | 0 | 3 | 0 | 2 | 0
petclinic | org.springframework.samples.petclinic.visit | Visit | 0 | 27 | 0 | 0 | 0 | 12 | 0 | 7 | 0 | 7
petclinic | org.springframework.samples.petclinic.owner | VisitController | 51 | 0 | 2 | 0 | 16 | 0 | 6 | 0 | 5 | 0
petclinic | org.springframework.samples.petclinic.owner | Owner | 117 | 24 | 12 | 0 | 27 | 10 | 13 | 7 | 7 | 7
petclinic | org.springframework.samples.petclinic.owner | OwnerController | 144 | 0 | 10 | 0 | 36 | 0 | 14 | 0 | 9 | 0
petclinic | org.springframework.samples.petclinic.owner | PetType | 0 | 3 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1
petclinic | org.springframework.samples.petclinic.owner | PetTypeFormatter | 44 | 0 | 4 | 0 | 10 | 0 | 5 | 0 | 3 | 0
petclinic | org.springframework.samples.petclinic.owner | Pet | 46 | 25 | 2 | 0 | 13 | 9 | 6 | 6 | 5 | 6
petclinic | org.springframework.samples.petclinic.owner | PetController | 120 | 0 | 10 | 0 | 32 | 0 | 14 | 0 | 9 | 0
petclinic | org.springframework.samples.petclinic.owner | PetValidator | 41 | 0 | 8 | 0 | 11 | 0 | 7 | 0 | 3 | 0
petclinic | org.springframework.samples.petclinic.system | WelcomeController | 5 | 0 | 0 | 0 | 2 | 0 | 2 | 0 | 2 | 0
petclinic | org.springframework.samples.petclinic.system | CacheConfiguration | 19 | 0 | 0 | 0 | 5 | 0 | 4 | 0 | 4 | 0
petclinic | org.springframework.samples.petclinic.system | CrashController | 8 | 0 | 0 | 0 | 2 | 0 | 2 | 0 | 2 | 0

Instruction coverage: 130 / 828 (15.00 %)

Command run: mvn package -Dmaven.test.failure.ignore=true -Dtest='*DiffblueTest'
