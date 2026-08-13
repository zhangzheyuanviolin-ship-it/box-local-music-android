            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class l0i10lIio {
                public static final void I00000oIO(int i, int i2) {
/* 1 */             if (i == i2) {
/* 3 */                 return;
                    }
/* 14 */            I000II.I000iOII(Oi010OO0.I0010o("Class declares ", i, " type parameters, but ", i2, " were provided."));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [Il01100l, java.util.List] */
                public static I011olOoO I00000oOI(O0IiIl0il o0IiIl0il, ArrayList arrayList, int i) {
/* 1 */             int i2 = i & 1;
/* 3 */             ?? r0 = Il01100l.I00iOIl;
/* 5 */             if (i2 != 0) {
/* 7 */                 arrayList = r0;
                    }
/* 10 */            return I0000Il00O(o0IiIl0il, arrayList, false, r0, null);
                }

                public static final I011olOoO I0000Il00O(O0IiIl0il o0IiIl0il, List list, boolean z, List list2, O0IOli0o0 o0IOli0o0) {
                    IOIiO1lIl0l iOIiO1lIl0lI00Iooi00oi;
                    OlIo1I olIo1I;
/* 4 */             if (!OllOoiO.I00000oIO) {
/* 242 */               O0IOli0o0 o0IOli0o02 = o0IiIl0il instanceof O0IOli0o0 ? (O0IOli0o0) o0IiIl0il : null;
/* 245 */               List listI00000oOI = o0IOli0o02 != null ? IO0O0o0O1Ol.I00000oOI(o0IOli0o02) : null;
/* 249 */               if (listI00000oOI == null) {
/* 251 */                   listI00000oOI = Il01100l.I00iOIl;
                        }
/* 261 */               I00000oIO(listI00000oOI.size(), list.size());
/* 278 */               return new Ol0IlIlo1lo1(o0IiIl0il, list, z, list2, null, false, false, false, o0IOli0o0, null);
                    }
/* 8 */             if (o0IiIl0il instanceof O0Ii1IOoiO) {
/* 12 */                iOIiO1lIl0lI00Iooi00oi = ((O0Ii1IOoiO) o0IiIl0il).I00Iooi00oi();
                    } else {
/* 19 */                if (!(o0IiIl0il instanceof O0O0iO)) {
/* 203 */                   StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
/* 206 */                   sb.append(o0IiIl0il);
/* 209 */                   Class<?> cls = o0IiIl0il.getClass();
/* 215 */                   sb.append(" (");
/* 218 */                   sb.append(cls);
/* 223 */                   sb.append(')');
/* 233 */                   throw new Ii01OOool(sb.toString());
                        }
/* 21 */                O0O0iO o0O0iO = (O0O0iO) o0IiIl0il;
/* 23 */                OoOOiO ooOOiO = o0O0iO.I00ilI0I1;
/* 25 */                if (ooOOiO == null) {
/* 193 */                   IOOlIIilOl0.I000lI("Descriptor-less type parameter: ", o0O0iO);
/* 3 */                     return null;
                        }
/* 27 */                iOIiO1lIl0lI00Iooi00oi = ooOOiO;
                    }
/* 44 */            I00000oIO(iOIiO1lIl0lI00Iooi00oi.I000OOo1O().I000II().size(), list.size());
/* 49 */            OoOIOoO1I ooOIOoO1II000OOo1O = iOIiO1lIl0lI00Iooi00oi.I000OOo1O();
/* 53 */            List listI000II = ooOIOoO1II000OOo1O.I000II();
/* 59 */            OoOI1i1i.I00iiI.getClass();
/* 62 */            OoOI1i1i ooOI1i1i = OoOI1i1i.I00iiO;
/* 64 */            List list3 = list;
/* 74 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 81 */            int i = 0;
/* 86 */            for (Object obj : list3) {
/* 92 */                int i2 = i + 1;
/* 94 */                if (i < 0) {
/* 179 */                   IOOi1I.I000lI();
/* 182 */                   throw null;
                        }
/* 96 */                O0O0o1io o0O0o1io = (O0O0o1io) obj;
/* 100 */               IiOOIlll iiOOIlll = (IiOOIlll) o0O0o1io.I00000oOI;
/* 107 */               O0iIl1 o0iIl1 = iiOOIlll != null ? iiOOIlll.I00iiI : null;
/* 108 */               O0O10O o0o10o = o0O0o1io.I00000oIO;
/* 121 */               int i3 = o0o10o == null ? -1 : O0IOil.I00000oIO[o0o10o.ordinal()];
/* 123 */               if (i3 == -1) {
/* 170 */                   olIo1I = new OlIo1I((OoOOiO) listI000II.get(i));
                        } else if (i3 == 1) {
/* 158 */                   olIo1I = new OlIo1I(o0iIl1, Ooo0Ioii0o0.I00iiO);
                        } else if (i3 == 2) {
/* 150 */                   olIo1I = new OlIo1I(o0iIl1, Ooo0Ioii0o0.I00iio);
                        } else {
/* 132 */                   if (i3 != 3) {
/* 142 */                       I000II.I00000oIO();
/* 3 */                         return null;
                            }
/* 138 */                   olIo1I = new OlIo1I(o0iIl1, Ooo0Ioii0o0.I00ilI0I1);
                        }
/* 174 */               arrayList.add(olIo1I);
/* 177 */               i = i2;
                    }
/* 187 */           return new IiOOIlll(l0loOIIo0iOo.I0000Il00O(ooOI1i1i, ooOIOoO1II000OOo1O, arrayList, z));
                }
            }
