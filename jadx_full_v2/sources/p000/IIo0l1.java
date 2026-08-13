            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class IIo0l1 {
                public static final IIo0l1 I00000oOI;
                public static final IIo0l1 I0000Il00O;
                public LinkedHashSet I00000oIO;

                static {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 8 */             O0oO01olI0 o0oO01olI0 = new O0oO01olI0();
/* 12 */            o0oO01olI0.I00000oOI = 0;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            linkedHashSet.add(o0oO01olI0);
/* 22 */            IIo0l1 iIo0l1 = new IIo0l1();
/* 25 */            iIo0l1.I00000oIO = linkedHashSet;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            I00000oOI = iIo0l1;
/* 34 */            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 39 */            O0oO01olI0 o0oO01olI02 = new O0oO01olI0();
/* 43 */            o0oO01olI02.I00000oOI = 1;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            linkedHashSet2.add(o0oO01olI02);
/* 53 */            IIo0l1 iIo0l12 = new IIo0l1();
/* 56 */            iIo0l12.I00000oIO = linkedHashSet2;
/* 58 */            VarHandle.storeStoreFence();
/* 61 */            I0000Il00O = iIo0l12;
                }

                public final ArrayList I00000oIO(ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList(arrayList);
/* 8 */             Iterator it = this.I00000oIO.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                IIli1ol10i iIli1ol10i = (IIli1ol10i) it.next();
/* 24 */                List<IIllOioOlolI> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
/* 28 */                O0oO01olI0 o0oO01olI0 = (O0oO01olI0) iIli1ol10i;
/* 30 */                o0oO01olI0.getClass();
/* 35 */                ArrayList arrayList3 = new ArrayList();
/* 46 */                for (IIllOioOlolI iIllOioOlolI : listUnmodifiableList) {
/* 58 */                    lII1OI11o1I.I00000oIO("The camera info doesn't contain internal implementation.", iIllOioOlolI instanceof IIllOioOlolI);
/* 67 */                    if (iIllOioOlolI.I000iOII() == o0oO01olI0.I00000oOI) {
/* 69 */                        arrayList3.add(iIllOioOlolI);
                            }
                        }
/* 73 */                arrayList2 = arrayList3;
                    }
/* 75 */            arrayList2.retainAll(arrayList);
/* 168 */           return arrayList2;
                }

                public final Integer I00000oOI() {
/* 3 */             Iterator it = this.I00000oIO.iterator();
/* 8 */             Integer num = null;
/* 13 */            while (it.hasNext()) {
/* 19 */                IIli1ol10i iIli1ol10i = (IIli1ol10i) it.next();
/* 23 */                if (iIli1ol10i instanceof O0oO01olI0) {
/* 29 */                    Integer numValueOf = Integer.valueOf(((O0oO01olI0) iIli1ol10i).I00000oOI);
/* 33 */                    if (num == null) {
/* 35 */                        num = numValueOf;
                            } else if (!num.equals(numValueOf)) {
/* 46 */                        I000II.I001IO000("Multiple conflicting lens facing requirements exist.");
/* 7 */                         return null;
                            }
                        }
                    }
/* 55 */            return num;
                }

                public final IIllOo0 I0000Il00O(LinkedHashSet linkedHashSet) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Iterator it = linkedHashSet.iterator();
/* 14 */            while (it.hasNext()) {
/* 26 */                arrayList.add(((IIllOo0) it.next()).I0000Il00O());
                    }
/* 30 */            ArrayList arrayListI00000oIO = I00000oIO(arrayList);
/* 36 */            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 39 */            Iterator it2 = linkedHashSet.iterator();
/* 47 */            while (it2.hasNext()) {
/* 53 */                IIllOo0 iIllOo0 = (IIllOo0) it2.next();
/* 63 */                if (arrayListI00000oIO.contains(iIllOo0.I0000Il00O())) {
/* 65 */                    linkedHashSet2.add(iIllOo0);
                        }
                    }
/* 69 */            Iterator it3 = linkedHashSet2.iterator();
/* 77 */            if (it3.hasNext()) {
/* 83 */                return (IIllOo0) it3.next();
                    }
/* 90 */            StringBuilder sb = new StringBuilder("Cams:");
/* 97 */            sb.append(linkedHashSet.size());
/* 100 */           Iterator it4 = linkedHashSet.iterator();
/* 110 */           while (it4.hasNext()) {
/* 118 */               IIllOioOlolI iIllOioOlolII0010o = ((IIllOo0) it4.next()).I0010o();
/* 150 */               sb.append(" Id:" + iIllOioOlolII0010o.I0001Ioi1lo() + "  Lens:" + iIllOioOlolII0010o.I000iOII());
                    }
/* 154 */           String string = sb.toString();
/* 160 */           LinkedHashSet linkedHashSet3 = this.I00000oIO;
/* 172 */           StringBuilder sb2 = new StringBuilder(Oi010OO0.I000oI1ioi(linkedHashSet3.size(), "PhyId:null  Filters:"));
/* 175 */           Iterator it5 = linkedHashSet3.iterator();
/* 183 */           while (it5.hasNext()) {
/* 189 */               IIli1ol10i iIli1ol10i = (IIli1ol10i) it5.next();
/* 191 */               sb2.append(" Id:");
/* 194 */               iIli1ol10i.getClass();
/* 199 */               sb2.append(IIli1ol10i.I00000oIO);
/* 204 */               if (iIli1ol10i instanceof O0oO01olI0) {
/* 208 */                   sb2.append(" LensFilter:");
/* 215 */                   sb2.append(((O0oO01olI0) iIli1ol10i).I00000oOI);
                        }
                    }
/* 231 */           I000II.I000iOII(IIl001iO0Io.I000oI1ioi("No available camera can be found. ", string, " ", sb2.toString()));
/* 234 */           return null;
                }
            }
