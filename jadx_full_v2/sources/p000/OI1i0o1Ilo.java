            package p000;

            import java.util.Iterator;
            import java.util.LinkedHashMap;
            
            public final class OI1i0o1Ilo extends OooioIIoi0O {
                public final LinkedHashMap I00000oOI = new LinkedHashMap();

                @Override
                public final void I0000O() {
/* 1 */             LinkedHashMap linkedHashMap = this.I00000oOI;
/* 7 */             Iterator it = linkedHashMap.values().iterator();
/* 15 */            while (it.hasNext()) {
/* 23 */                ((Oool0l1iOIOl) it.next()).I00000oIO();
                    }
/* 27 */            linkedHashMap.clear();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("NavControllerViewModel{");
/* 8 */             int iIdentityHashCode = System.identityHashCode(this);
/* 14 */            iOlI1lIi0.I00000oIO(16);
/* 28 */            sb.append(li01Io1li.I00000oOI(16, iIdentityHashCode & 4294967295L));
/* 33 */            sb.append("} ViewModelStores (");
/* 42 */            Iterator it = this.I00000oOI.keySet().iterator();
/* 50 */            while (it.hasNext()) {
/* 58 */                sb.append((String) it.next());
/* 65 */                if (it.hasNext()) {
/* 69 */                    sb.append(", ");
                        }
                    }
/* 75 */            sb.append(')');
/* 78 */            return sb.toString();
                }
            }
