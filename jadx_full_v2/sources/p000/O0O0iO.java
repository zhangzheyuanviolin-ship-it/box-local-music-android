            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
/* 108 */   public final class O0O0iO implements O0O0OIOO, OoOIi1lliil, OoOOlO11iOi {
                public final O0O0iOl1l I00iOIl;
                public final IllOOo00lI I00iiI;
                public final String I00iiO;
                public final O0O10O I00iio;
                public final OoOOiO I00ilI0I1;
                public volatile List I00ilO0;

                public O0O0iO(O0O0iOl1l o0O0iOl1l, OoOOiO ooOOiO) {
                    O0O10O o0o10o;
/* 5 */             I01iiIii10O i01iiIii10O = new I01iiIii10O(29);
/* 8 */             i01iiIii10O.I00iiI = ooOOiO;
/* 10 */            VarHandle.storeStoreFence();
/* 14 */            OOoOiOo01lo oOoOiOo01loI00000oIO = lIlo0Oi0oOI.I00000oIO(null, i01iiIii10O);
/* 22 */            String strI00000oOI = ooOOiO.getName().I00000oOI();
/* 30 */            int iOrdinal = ooOOiO.I000l1().ordinal();
/* 34 */            if (iOrdinal == 0) {
/* 53 */                o0o10o = O0O10O.I00iOIl;
                    } else if (iOrdinal == 1) {
/* 50 */                o0o10o = O0O10O.I00iiI;
                    } else {
/* 40 */                if (iOrdinal != 2) {
/* 46 */                    I000II.I00000oIO();
/* 49 */                    throw null;
                        }
/* 42 */                o0o10o = O0O10O.I00iiO;
                    }
/* 44 */            O0O10O o0o10o2 = o0o10o;
/* 56 */            ooOOiO.I001lllioOl();
/* 62 */            this(ooOOiO, o0O0iOl1l, oOoOiOo01loI00000oIO, strI00000oOI, o0o10o2);
/* 65 */            List upperBounds = ooOOiO.getUpperBounds();
/* 79 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(upperBounds, 10));
/* 82 */            Iterator it = upperBounds.iterator();
/* 90 */            while (it.hasNext()) {
/* 103 */               arrayList.add(new IiOOIlll((O0iIl1) it.next()));
                    }
/* 107 */           this.I00ilO0 = arrayList;
                }

                @Override
                public final O0O10O I000l1() {
/* 1 */             return this.I00iio;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof O0O0iO)) {
/* 49 */                return false;
                    }
/* 5 */             O0O0iOl1l o0O0iOl1l = this.I00iOIl;
/* 7 */             if (o0O0iOl1l == null) {
/* 15 */                o0O0iOl1l = (O0O0iOl1l) this.I00iiI.invoke();
                    }
/* 17 */            O0O0iO o0O0iO = (O0O0iO) obj;
/* 19 */            O0O0iOl1l o0O0iOl1l2 = o0O0iO.I00iOIl;
/* 21 */            if (o0O0iOl1l2 == null) {
/* 29 */                o0O0iOl1l2 = (O0O0iOl1l) o0O0iO.I00iiI.invoke();
                    }
                    return O0000Ioio00.I0000O(o0O0iOl1l, o0O0iOl1l2) && O0000Ioio00.I0000O(this.I00iiO, o0O0iO.I00iiO);
                }

                @Override
                public final String getName() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final List getUpperBounds() {
/* 1 */             List list = this.I00ilO0;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("upperBounds");
/* 29 */            throw null;
                }

                public final int hashCode() {
/* 1 */             O0O0iOl1l o0O0iOl1l = this.I00iOIl;
/* 3 */             if (o0O0iOl1l == null) {
/* 11 */                o0O0iOl1l = (O0O0iOl1l) this.I00iiI.invoke();
                    }
/* 25 */            return this.I00iiO.hashCode() + (o0O0iOl1l.hashCode() * 31);
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             int iOrdinal = this.I00iio.ordinal();
/* 12 */            if (iOrdinal != 0) {
/* 15 */                if (iOrdinal == 1) {
/* 33 */                    sb.append("in ");
                        } else {
/* 18 */                    if (iOrdinal != 2) {
/* 26 */                        I000II.I00000oIO();
/* 29 */                        return null;
                            }
/* 22 */                    sb.append("out ");
                        }
                    }
/* 38 */            sb.append(this.I00iiO);
/* 41 */            return sb.toString();
                }

/* 109 */       public O0O0iO(O0O0iOl1l o0O0iOl1l, String str, O0O10O o0o10o) {
/* 110 */           this(null, o0O0iOl1l, null, str, o0o10o);
                }

/* 110 */       public O0O0iO(OoOOiO ooOOiO, O0O0iOl1l o0O0iOl1l, OOoOiOo01lo oOoOiOo01lo, String str, O0O10O o0o10o) {
/* 112 */           this.I00iOIl = o0O0iOl1l;
/* 113 */           this.I00iiI = oOoOiOo01lo;
/* 114 */           this.I00iiO = str;
/* 115 */           this.I00iio = o0o10o;
/* 116 */           this.I00ilI0I1 = ooOOiO;
                }
            }
