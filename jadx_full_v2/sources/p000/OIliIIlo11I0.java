            package p000;
            
/* 10 */    public abstract class OIliIIlo11I0 implements IIi0O1OOO1i0 {
                private final IIOoi0ooOoO I00iOIl;

                public OIliIIlo11I0() {
/* 9 */             this.I00iOIl = new IIOoi0ooOoO();
                }

                @Override
                public IIOoi0ooOoO I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof OIliIIlo11I0) {
/* 15 */                return this.I00iOIl.equals(((OIliIIlo11I0) obj).I00iOIl);
                    }
/* 20 */            return false;
                }

                public int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

/* 11 */        public OIliIIlo11I0(IIOoi0ooOoO iIOoi0ooOoO) {
/* 13 */            this.I00iOIl = iIOoi0ooOoO;
                }
            }
