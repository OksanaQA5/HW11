package HW10;

public class Family {
        private Human mother;
        private Human father;
        private Human[] children;
        private Pet pet;

        public Family(Human mother, Human father) {
            this.mother = mother;
            this.father = father;
            this.children = new Human[0];
            mother.setFamily(this);
            father.setFamily(this);
        }

        public void addChild(Human child) {
            Human[] updatedChildren = Arrays.copyOf(children, children.length + 1);
            updatedChildren[children.length] = child;
            children = updatedChildren;
            child.setFamily(this);
        }

        public boolean deleteChild(Human child) {
            int index = -1;
            for (int i = 0; i < children.length; i++) {
                if (children[i].equals(child)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                Human[] updatedChildren = new Human[children.length - 1];
                System.arraycopy(children, 0, updatedChildren, 0, index);
                System.arraycopy(children, index + 1, updatedChildren, index, children.length - index - 1);
                children = updatedChildren;
                child.setFamily(null);
                return true;
            } else {
                return false;
            }
        }

        public int countFamily() {
            return 2 + children.length;
        }

        @Override
        public String toString() {
            return "Family{mother=" + mother.getName() + " " + mother.getSurname() +
                    ", father=" + father.getName() + " " + father.getSurname() +
                    ", children=" + Arrays.toString(children) +
                    ", pet=" + pet + "}";
        }
}
