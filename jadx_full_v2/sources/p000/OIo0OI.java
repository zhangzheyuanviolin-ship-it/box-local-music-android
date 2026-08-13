            package p000;
            
/* 5 */     public class OIo0OI extends OIliIIlo11I0 {
                private final OIo0O1iOoool I00iiI;

                public OIo0OI(OIo0O1iOoool oIo0O1iOoool) {
/* 4 */             this.I00iiI = oIo0O1iOoool;
                }

                private boolean I0000oI00(Object obj, Object obj2) {
                    return obj == null ? obj2 != null : true ^ obj.equals(obj2);
                }

                private void I000II(Object obj, Object obj2) {
/* 5 */             if (I0000oI00(obj, obj2)) {
/* 9 */                 this.I00iiI.I00100o1O0lo(this);
                    }
                }

                public String I00000oOI() {
/* 7 */             return I00Io1lO().I010I0(IIi0I0I0o.I01OOIlI);
                }

                public String I0000Il00O() {
/* 7 */             return I00Io1lO().I010101Oo1lO(IIi0I0I0o.I0I0I10I);
                }

                public IIOoOiOI I0000O() {
/* 7 */             return I00Io1lO().I00oII(IIi0I0I0o.I0Il1IoilolI);
                }

                public boolean I0001Ioi1lo() {
/* 8 */             return I00Io1lO().I00l0I0l0lO1(IIi0I0I0o.I01ii1i, false);
                }

                public void I000O01llI0(String str) {
/* 5 */             I000II(I00000oOI(), str);
/* 14 */            I00Io1lO().I010l1O(IIi0I0I0o.I01OOIlI, str);
                }

                public void I000OOo1O(boolean z) {
/* 13 */            I000II(Boolean.valueOf(I0001Ioi1lo()), Boolean.valueOf(z));
/* 29 */            I00Io1lO().I010iIIOlo(IIi0I0I0o.I01ii1i, z ? IIOoOl1o1.I00iiI : IIOoOl1o1.I00iiO);
                }

                public void I000OiO(String str) {
/* 5 */             I000II(I0000Il00O(), str);
/* 14 */            I00Io1lO().I010l10O(IIi0I0I0o.I0I0I10I, str);
                }

                public void I000iOII(IIOoOiOI iIOoOiOI) {
/* 5 */             I000II(I0000O(), iIOoOiOI);
/* 14 */            I00Io1lO().I010iIIOlo(IIi0I0I0o.I0Il1IoilolI, iIOoOiOI);
                }

                @Override
                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 10 */            if (!super.equals(obj) || getClass() != obj.getClass()) {
/* 9 */                 return false;
                    }
/* 26 */            OIo0O1iOoool oIo0O1iOoool = this.I00iiI;
/* 28 */            OIo0O1iOoool oIo0O1iOoool2 = ((OIo0OI) obj).I00iiI;
/* 30 */            if (oIo0O1iOoool == null) {
/* 32 */                if (oIo0O1iOoool2 != null) {
/* 9 */                     return false;
                        }
                    } else if (!oIo0O1iOoool.equals(oIo0O1iOoool2)) {
/* 9 */                 return false;
                    }
/* 1 */             return true;
                }

                @Override
                public int hashCode() {
/* 5 */             int iHashCode = super.hashCode() * 31;
/* 7 */             OIo0O1iOoool oIo0O1iOoool = this.I00iiI;
/* 17 */            return iHashCode + (oIo0O1iOoool == null ? 0 : oIo0O1iOoool.hashCode());
                }

                public String toString() {
/* 51 */            return "Name=" + I0000Il00O() + ", Value=" + I0000O() + ", FormattedValue=" + I00000oOI() + ", Hidden=" + I0001Ioi1lo();
                }

/* 6 */         public OIo0OI(IIOoi0ooOoO iIOoi0ooOoO, OIo0O1iOoool oIo0O1iOoool) {
/* 7 */             super(iIOoi0ooOoO);
/* 8 */             this.I00iiI = oIo0O1iOoool;
                }
            }
