            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            import java.util.ListIterator;
            
            public abstract class lO0o0ioo0 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[LOOP:0: B:3:0x000b->B:25:0x008f, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[EDGE_INSN: B:41:0x0093->B:26:0x0093 BREAK  A[LOOP:0: B:3:0x000b->B:25:0x008f], SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OiO1O1lil10 I00000oIO(i1O01Ill i1o01ill, List list, List list2, List list3) {
                    OI1llOooOl1 oI1llOooOl1;
                    Object objPrevious;
/* 4 */             int size = list2.size();
/* 9 */             int i = 0;
/* 10 */            Ol0OOlIi ol0OOlIi = null;
/* 11 */            int i2 = 0;
/* 13 */            while (i2 < size) {
/* 27 */                if (((i1liolI) list2.get(i2)).I00000oIO.I00000oIO < 600 || (oI1llOooOl1 = (OI1llOooOl1) IOOi0Ool1i.I00IoIO0lI(list)) == null) {
/* 141 */                   ol0OOlIi = null;
/* 142 */                   if (ol0OOlIi == null) {
                                break;
                            }
/* 144 */                   i2++;
                            ol0OOlIi = ol0OOlIi;
                        } else {
/* 45 */                    if (true != oI1llOooOl1.I0000Il00O.containsKey("ListDetailScene-Detail")) {
/* 47 */                        oI1llOooOl1 = null;
                            }
/* 48 */                    if (oI1llOooOl1 != null) {
/* 54 */                        ListIterator listIterator = list.listIterator(list.size());
                                while (true) {
/* 62 */                            if (!listIterator.hasPrevious()) {
/* 82 */                                objPrevious = null;
                                        break;
                                    }
/* 64 */                            objPrevious = listIterator.previous();
/* 79 */                            if (((OI1llOooOl1) objPrevious).I0000Il00O.containsKey("ListDetailScene-List")) {
                                        break;
                                    }
                                }
/* 83 */                        OI1llOooOl1 oI1llOooOl12 = (OI1llOooOl1) objPrevious;
/* 85 */                        if (oI1llOooOl12 != null) {
/* 87 */                            Object obj = oI1llOooOl12.I00000oOI;
/* 91 */                            List listI001l0I00 = IOOi0Ool1i.I001l0I00(list);
/* 95 */                            i1Oi101Ii1I i1oi101ii1i = new i1Oi101Ii1I();
/* 98 */                            i1oi101ii1i.I00000oIO = obj;
/* 100 */                           i1oi101ii1i.I00000oOI = listI001l0I00;
/* 102 */                           i1oi101ii1i.I0000Il00O = oI1llOooOl12;
/* 104 */                           i1oi101ii1i.I0000O = oI1llOooOl1;
/* 114 */                           i1oi101ii1i.I0000oI00 = IOOi1I.I000O01llI0(oI1llOooOl12, oI1llOooOl1);
/* 118 */                           i1IIlI i1iili = new i1IIlI(i);
/* 121 */                           i1iili.I00iiI = i1oi101ii1i;
/* 123 */                           VarHandle.storeStoreFence();
/* 134 */                           i1oi101ii1i.I0001Ioi1lo = new IOii1l(23545953, i1iili, true);
/* 136 */                           VarHandle.storeStoreFence();
/* 139 */                           ol0OOlIi = i1oi101ii1i;
                                }
/* 142 */                       if (ol0OOlIi == null) {
                                }
                            }
                        }
                    }
/* 148 */           if (ol0OOlIi == null) {
/* 158 */               Object obj2 = ((OI1llOooOl1) IOOi0Ool1i.I00Io1o110i(list)).I00000oOI;
/* 164 */               OI1llOooOl1 oI1llOooOl13 = (OI1llOooOl1) IOOi0Ool1i.I00Io1o110i(list);
/* 166 */               List listI001l0I002 = IOOi0Ool1i.I001l0I00(list);
/* 170 */               ol0OOlIi = new Ol0OOlIi();
/* 173 */               ol0OOlIi.I00000oIO = obj2;
/* 175 */               ol0OOlIi.I00000oOI = oI1llOooOl13;
/* 177 */               ol0OOlIi.I0000Il00O = listI001l0I002;
/* 183 */               ol0OOlIi.I0000O = Collections.singletonList(oI1llOooOl13);
/* 189 */               O1IIii o1IIii = new O1IIii(29);
/* 192 */               o1IIii.I00iiI = ol0OOlIi;
/* 194 */               VarHandle.storeStoreFence();
/* 205 */               ol0OOlIi.I0000oI00 = new IOii1l(-322904035, o1IIii, true);
/* 207 */               VarHandle.storeStoreFence();
                    }
/* 213 */           int size2 = list3.size();
                    OiO1O1lil10 oiO1O1lil10 = ol0OOlIi;
/* 217 */           while (i < size2) {
/* 223 */               if (list3.get(i) != null) {
/* 239 */                   OIiilo1Ool0o.I00000oIO();
/* 8 */                     return null;
                        }
/* 232 */               OIlIii oIlIii = oiO1O1lil10 instanceof OIlIii ? (OIlIii) oiO1O1lil10 : null;
/* 233 */               oIlIii.getClass();
/* 236 */               i++;
                        oiO1O1lil10 = oIlIii;
                    }
/* 1182 */          return oiO1O1lil10;
                }
            }
