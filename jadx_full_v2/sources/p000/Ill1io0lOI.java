            package p000;

            import java.util.HashMap;
            import java.util.Iterator;
            
            public final class Ill1io0lOI extends OooioIIoi0O {
                public static final IiIO0l I000O01llI0 = new IiIO0l(1);
                public final boolean I0000oI00;
                public final HashMap I00000oOI = new HashMap();
                public final HashMap I0000Il00O = new HashMap();
                public final HashMap I0000O = new HashMap();
                public boolean I0001Ioi1lo = false;
                public boolean I000II = false;

                public Ill1io0lOI(boolean z) {
/* 30 */            this.I0000oI00 = z;
                }

                @Override
                public final void I0000O() {
/* 6 */             if (Ill1OlOOl.I00IOO(3)) {
/* 8 */                 toString();
                    }
/* 12 */            this.I0001Ioi1lo = true;
                }

                public final void I0000oI00(String str) {
/* 1 */             HashMap map = this.I0000Il00O;
/* 7 */             Ill1io0lOI ill1io0lOI = (Ill1io0lOI) map.get(str);
/* 9 */             if (ill1io0lOI != null) {
/* 11 */                ill1io0lOI.I0000O();
/* 14 */                map.remove(str);
                    }
/* 17 */            HashMap map2 = this.I0000O;
/* 23 */            Oool0l1iOIOl oool0l1iOIOl = (Oool0l1iOIOl) map2.get(str);
/* 25 */            if (oool0l1iOIOl != null) {
/* 27 */                oool0l1iOIOl.I00000oIO();
/* 30 */                map2.remove(str);
                    }
                }

                public final void I0001Ioi1lo(Ill0l1 ill0l1) {
/* 4 */             if (this.I000II) {
/* 6 */                 Ill1OlOOl.I00IOO(2);
                    } else {
/* 18 */                if (this.I00000oOI.remove(ill0l1.I00ilI0I1) == null || !Ill1OlOOl.I00IOO(2)) {
/* 29 */                    return;
                        }
/* 26 */                ill0l1.toString();
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && Ill1io0lOI.class == obj.getClass()) {
/* 17 */                Ill1io0lOI ill1io0lOI = (Ill1io0lOI) obj;
/* 27 */                if (this.I00000oOI.equals(ill1io0lOI.I00000oOI) && this.I0000Il00O.equals(ill1io0lOI.I0000Il00O) && this.I0000O.equals(ill1io0lOI.I0000O)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 24 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + (this.I00000oOI.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
/* 16 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */            sb.append("} Fragments (");
/* 30 */            Iterator it = this.I00000oOI.values().iterator();
/* 40 */            while (it.hasNext()) {
/* 46 */                sb.append(it.next());
/* 53 */                if (it.hasNext()) {
/* 55 */                    sb.append(", ");
                        }
                    }
/* 61 */            sb.append(") Child Non Config (");
/* 70 */            Iterator it2 = this.I0000Il00O.keySet().iterator();
/* 78 */            while (it2.hasNext()) {
/* 86 */                sb.append((String) it2.next());
/* 93 */                if (it2.hasNext()) {
/* 95 */                    sb.append(", ");
                        }
                    }
/* 101 */           sb.append(") ViewModelStores (");
/* 110 */           Iterator it3 = this.I0000O.keySet().iterator();
/* 118 */           while (it3.hasNext()) {
/* 126 */               sb.append((String) it3.next());
/* 133 */               if (it3.hasNext()) {
/* 135 */                   sb.append(", ");
                        }
                    }
/* 141 */           sb.append(')');
/* 144 */           return sb.toString();
                }
            }
