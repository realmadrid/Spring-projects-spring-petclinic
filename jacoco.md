GROUP | PACKAGE | CLASS | INSTRUCTION_MISSED | INSTRUCTION_COVERED | BRANCH_MISSED | BRANCH_COVERED | LINE_MISSED | LINE_COVERED | COMPLEXITY_MISSED | COMPLEXITY_COVERED | METHOD_MISSED | METHOD_COVERED
--- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---
petclinic | org.springframework.samples.petclinic | PetClinicApplication | 5 | 3 | 0 | 0 | 2 | 1 | 1 | 1 | 1 | 1
petclinic | org.springframework.samples.petclinic.model | BaseEntity | 0 | 17 | 0 | 2 | 0 | 5 | 0 | 5 | 0 | 4
petclinic | org.springframework.samples.petclinic.model | NamedEntity | 0 | 13 | 0 | 0 | 0 | 5 | 0 | 4 | 0 | 4
petclinic | org.springframework.samples.petclinic.model | Person | 0 | 17 | 0 | 0 | 0 | 7 | 0 | 5 | 0 | 5
petclinic | org.springframework.samples.petclinic.vet | VetController | 31 | 6 | 0 | 0 | 7 | 3 | 2 | 1 | 2 | 1
petclinic | org.springframework.samples.petclinic.vet | Vet | 0 | 45 | 0 | 2 | 0 | 12 | 0 | 7 | 0 | 6
petclinic | org.springframework.samples.petclinic.vet | Specialty | 0 | 3 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1
petclinic | org.springframework.samples.petclinic.vet | Vets | 0 | 14 | 1 | 1 | 0 | 4 | 1 | 2 | 0 | 2
petclinic | org.springframework.samples.petclinic.visit | Visit | 0 | 27 | 0 | 0 | 0 | 12 | 0 | 7 | 0 | 7
petclinic | org.springframework.samples.petclinic.owner | VisitController | 11 | 40 | 2 | 0 | 4 | 12 | 2 | 4 | 1 | 4
petclinic | org.springframework.samples.petclinic.owner | Owner | 2 | 139 | 3 | 9 | 1 | 36 | 3 | 17 | 0 | 14
petclinic | org.springframework.samples.petclinic.owner | OwnerController | 53 | 91 | 6 | 4 | 11 | 25 | 5 | 9 | 0 | 9
petclinic | org.springframework.samples.petclinic.owner | PetType | 0 | 3 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1
petclinic | org.springframework.samples.petclinic.owner | PetTypeFormatter | 13 | 31 | 1 | 3 | 1 | 9 | 1 | 4 | 0 | 3
petclinic | org.springframework.samples.petclinic.owner | Pet | 5 | 66 | 1 | 1 | 1 | 21 | 1 | 11 | 0 | 11
petclinic | org.springframework.samples.petclinic.owner | PetController | 20 | 100 | 5 | 5 | 6 | 26 | 5 | 9 | 0 | 9
petclinic | org.springframework.samples.petclinic.owner | PetValidator | 10 | 31 | 4 | 4 | 2 | 9 | 4 | 3 | 0 | 3
petclinic | org.springframework.samples.petclinic.system | WelcomeController | 0 | 5 | 0 | 0 | 0 | 2 | 0 | 2 | 0 | 2
petclinic | org.springframework.samples.petclinic.system | CacheConfiguration | 0 | 19 | 0 | 0 | 0 | 5 | 0 | 4 | 0 | 4
petclinic | org.springframework.samples.petclinic.system | CrashController | 5 | 3 | 0 | 0 | 1 | 1 | 1 | 1 | 1 | 1

Instruction coverage: 673 / 828 (81.00 %)

Command run: mvn package -Dmaven.test.failure.ignore=true -Dtest='*DiffblueTest'
