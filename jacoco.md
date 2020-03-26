GROUP | PACKAGE | CLASS | INSTRUCTION_MISSED | INSTRUCTION_COVERED | BRANCH_MISSED | BRANCH_COVERED | LINE_MISSED | LINE_COVERED | COMPLEXITY_MISSED | COMPLEXITY_COVERED | METHOD_MISSED | METHOD_COVERED
--- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---
petclinic | org.springframework.samples.petclinic | PetClinicApplication | 8 | 0 | 0 | 0 | 3 | 0 | 2 | 0 | 2 | 0
petclinic | org.springframework.samples.petclinic.model | BaseEntity | 0 | 17 | 0 | 2 | 0 | 5 | 0 | 5 | 0 | 4
petclinic | org.springframework.samples.petclinic.model | NamedEntity | 0 | 13 | 0 | 0 | 0 | 5 | 0 | 4 | 0 | 4
petclinic | org.springframework.samples.petclinic.model | Person | 0 | 17 | 0 | 0 | 0 | 7 | 0 | 5 | 0 | 5
petclinic | org.springframework.samples.petclinic.vet | VetController | 0 | 37 | 0 | 0 | 0 | 10 | 0 | 3 | 0 | 3
petclinic | org.springframework.samples.petclinic.vet | Vet | 0 | 45 | 1 | 1 | 0 | 12 | 1 | 6 | 0 | 6
petclinic | org.springframework.samples.petclinic.vet | Specialty | 0 | 3 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1
petclinic | org.springframework.samples.petclinic.vet | Vets | 0 | 14 | 0 | 2 | 0 | 4 | 0 | 3 | 0 | 2
petclinic | org.springframework.samples.petclinic.visit | Visit | 0 | 27 | 0 | 0 | 0 | 12 | 0 | 7 | 0 | 7
petclinic | org.springframework.samples.petclinic.owner | VisitController | 6 | 45 | 1 | 1 | 2 | 14 | 1 | 5 | 0 | 5
petclinic | org.springframework.samples.petclinic.owner | Owner | 22 | 119 | 8 | 4 | 6 | 31 | 5 | 15 | 0 | 14
petclinic | org.springframework.samples.petclinic.owner | OwnerController | 64 | 80 | 6 | 4 | 14 | 22 | 6 | 8 | 1 | 8
petclinic | org.springframework.samples.petclinic.owner | PetType | 0 | 3 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1
petclinic | org.springframework.samples.petclinic.owner | PetTypeFormatter | 14 | 30 | 2 | 2 | 2 | 8 | 2 | 3 | 0 | 3
petclinic | org.springframework.samples.petclinic.owner | Pet | 5 | 66 | 1 | 1 | 1 | 21 | 1 | 11 | 0 | 11
petclinic | org.springframework.samples.petclinic.owner | PetController | 28 | 92 | 6 | 4 | 6 | 26 | 5 | 9 | 0 | 9
petclinic | org.springframework.samples.petclinic.owner | PetValidator | 18 | 23 | 5 | 3 | 3 | 8 | 4 | 3 | 0 | 3
petclinic | org.springframework.samples.petclinic.system | WelcomeController | 0 | 5 | 0 | 0 | 0 | 2 | 0 | 2 | 0 | 2
petclinic | org.springframework.samples.petclinic.system | CacheConfiguration | 19 | 0 | 0 | 0 | 5 | 0 | 4 | 0 | 4 | 0
petclinic | org.springframework.samples.petclinic.system | CrashController | 8 | 0 | 0 | 0 | 2 | 0 | 2 | 0 | 2 | 0

Instruction coverage: 636 / 828 (76.00 %)

Command run: mvn package -Dmaven.test.failure.ignore=true -Dtest='*DiffblueTest'
