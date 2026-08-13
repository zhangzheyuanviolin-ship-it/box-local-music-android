            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IlllIi1i1I extends I00o0iI0io1 {
                public final IlllOi0O I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlllIi1i1I(IlllOi0O illlOi0O) {
/* 5 */             super(illlOi0O.I00ilI0I1);
/* 1 */             this.I00iiO = illlOi0O;
                }

                @Override
                public final Collection I00000oIO() {
                    List listI000O01llI0;
/* 1 */             IlllOi0O illlOi0O = this.I00iiO;
/* 3 */             int i = illlOi0O.I00ioIO;
/* 5 */             Illo0o illo0o = illlOi0O.I00io1l;
/* 7 */             Illo01lli illo01lli = Illo01lli.I0000Il00O;
/* 14 */            if (O0000Ioio00.I0000O(illo0o, illo01lli)) {
/* 18 */                listI000O01llI0 = Collections.singletonList(IlllOi0O.I00ll1);
                    } else if (O0000Ioio00.I0000O(illo0o, Illo01ol1.I0000Il00O)) {
/* 48 */                listI000O01llI0 = IOOi1I.I000O01llI0(IlllOi0O.I00lli11, new IOIOill(OlIlllOI1.I000l1, illo01lli.I00000oIO(i)));
                    } else {
/* 53 */                Illo0liIIii illo0liIIii = Illo0liIIii.I0000Il00O;
/* 59 */                if (O0000Ioio00.I0000O(illo0o, illo0liIIii)) {
/* 63 */                    listI000O01llI0 = Collections.singletonList(IlllOi0O.I00ll1);
                        } else {
/* 74 */                    if (!O0000Ioio00.I0000O(illo0o, Illo0I.I0000Il00O)) {
/* 228 */                       int i2 = I0O1olO.I00000oIO;
/* 232 */                       I000II.I001IO000("should not be called");
/* 13 */                        return null;
                            }
/* 93 */                    listI000O01llI0 = IOOi1I.I000O01llI0(IlllOi0O.I00lli11, new IOIOill(OlIlllOI1.I0001Ioi1lo, illo0liIIii.I00000oIO(i)));
                        }
                    }
/* 101 */           OI0010oo1o oI0010oo1oI010iIIOlo = illlOi0O.I00ilO0.I010iIIOlo();
/* 105 */           List<IOIOill> list = listI000O01llI0;
/* 115 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 126 */           for (IOIOill iOIOill : list) {
/* 134 */               OI000ilOol oI000ilOolI00000oIO = ilOOOOloO.I00000oIO(oI0010oo1oI010iIIOlo, iOIOill);
/* 138 */               if (oI000ilOolI00000oIO == null) {
/* 217 */                   OIiilo1Ool0o.I0000oI00(iOIOill, "Built-in class ", " not found");
/* 13 */                    return null;
                        }
/* 154 */               List listI00i0O = IOOi0Ool1i.I00i0O(oI000ilOolI00000oIO.I000OOo1O().I000II().size(), illlOi0O.I00li1OI);
/* 166 */               ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00i0O, 10));
/* 169 */               Iterator it = listI00i0O.iterator();
/* 177 */               while (it.hasNext()) {
/* 194 */                   arrayList2.add(new OlIo1I(((OoOOiO) it.next()).I00Ol10()));
                        }
/* 200 */               OoOI1i1i.I00iiI.getClass();
/* 209 */               arrayList.add(l0loOIIo0iOo.I00000oOI(OoOI1i1i.I00iiO, oI000ilOolI00000oIO, arrayList2));
                    }
/* 221 */           return IOOi0Ool1i.I00iIi0i1o(arrayList);
                }

                @Override
                public final O1oO0lOoI1 I0000Il00O() {
/* 1 */             return O1oO0lOoI1.I00io1l;
                }

                @Override
                public final List I000II() {
/* 3 */             return this.I00iiO.I00li1OI;
                }

                @Override
                public final OI000ilOol I00100o1O0lo() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final IOIiO1lIl0l I00100o1O0lo() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final boolean I0010I0i() {
/* 1 */             return true;
                }

                public final String toString() {
/* 3 */             return this.I00iiO.toString();
                }
            }
