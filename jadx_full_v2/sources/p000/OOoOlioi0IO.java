            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.Metadata;
            
/* 87 */    public class OOoOlioi0IO extends OOoOl1001II {
                public static O0IiOio0lo0 I000oI1ioi(IIiO0l1Oiloi iIiO0l1Oiloi) {
/* 1 */             O0IiO0OiI o0IiO0OiII001l0I00 = iIiO0l1Oiloi.I001l0I00();
                    return o0IiO0OiII001l0I00 instanceof O0IiOio0lo0 ? (O0IiOio0lo0) o0IiO0OiII001l0I00 : Il00iliIIOii.I00iiI;
                }

                @Override
                public final O0Iill I00000oIO(IlllollI illlollI) {
/* 14 */            return new IiO11010IiO(I000oI1ioi(illlollI), illlollI.I00iio, illlollI.I00ilI0I1, null, illlollI.I00iiI);
                }

                @Override
                public final O0IOli0o0 I00000oOI(Class cls) {
/* 7 */             return (O0Ii1IOoiO) IIi1olo.I00000oIO.I00IoIO0lI(cls);
                }

                @Override
                public final O0IiO0OiI I0000Il00O(Class cls) {
/* 7 */             return (O0IiO0OiI) IIi1olo.I00000oOI.I00IoIO0lI(cls);
                }

                @Override
                public final O0O01O0o I0000O(O0O01O0o o0O01O0o) {
                    String strI000O01llI0;
/* 10 */            if (!OllOoiO.I00000oIO) {
/* 104 */               Ol0IlIlo1lo1 ol0IlIlo1lo1 = (Ol0IlIlo1lo1) o0O01O0o;
/* 106 */               O0IiIl0il o0IiIl0il = ol0IlIlo1lo1.I00iiI;
/* 116 */               O0IOli0o0 o0IOli0o0 = o0IiIl0il instanceof O0IOli0o0 ? (O0IOli0o0) o0IiIl0il : null;
/* 117 */               if (o0IOli0o0 == null || (strI000O01llI0 = o0IOli0o0.I000O01llI0()) == null) {
/* 172 */                   IoOOl0iOl1io.I001IIilI0O("Non-class type cannot be a mutable collection type: ", o0O01O0o);
/* 9 */                     return null;
                        }
/* 125 */               String str = O00oO0liO11.I00000oIO;
/* 132 */               Ill0IO ill0IOI000OOo1O = O00oO0liO11.I000OOo1O(new Ill0OI0lo(strI000O01llI0));
/* 136 */               if (ill0IOI000OOo1O != null) {
/* 164 */                   return new Ol0IlIlo1lo1(ol0IlIlo1lo1.I00iiI, ol0IlIlo1lo1.I00iiO, ol0IlIlo1lo1.I00iio, ol0IlIlo1lo1.I00ilI0I1, ol0IlIlo1lo1.I00ilO0, ol0IlIlo1lo1.I00io1l, ol0IlIlo1lo1.I00ioIO, ol0IlIlo1lo1.I00l0I0l0lO1, l1i1iiO0OII.I00000oIO(ill0IOI000OOo1O, (O0IOli0o0) o0IiIl0il), null);
                        }
/* 168 */               IioIoO10iOiI.I000OiO("Not a readonly collection: ", o0O01O0o);
/* 9 */                 return null;
                    }
/* 15 */            O0iIl1 o0iIl1 = ((IiOOIlll) o0O01O0o).I00iiI;
/* 19 */            if (!(o0iIl1 instanceof Ol0O0iI0l0O)) {
/* 99 */                OIiilo1Ool0o.I000O01llI0("Non-simple type cannot be a mutable collection type: ", o0O01O0o);
/* 9 */                 return null;
                    }
/* 25 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 36 */            OI000ilOol oI000ilOol = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : null;
/* 37 */            if (oI000ilOol == null) {
/* 93 */                IioIoO10iOiI.I000OiO("Non-class type cannot be a mutable collection type: ", o0O01O0o);
/* 9 */                 return null;
                    }
/* 41 */            Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) o0iIl1;
/* 43 */            String str2 = O00oO0liO11.I00000oIO;
/* 45 */            int i = IiOiOOIo.I00000oIO;
/* 51 */            Ill0IO ill0IOI000OOo1O2 = O00oO0liO11.I000OOo1O(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol));
/* 55 */            if (ill0IOI000OOo1O2 != null) {
/* 85 */                return new IiOOIlll(l0loOIIo0iOo.I0000Il00O(ol0O0iI0l0O.I00OloOo(), IiOiOOIo.I0000oI00(oI000ilOol).I000OiO(ill0IOI000OOo1O2).I000OOo1O(), ol0O0iI0l0O.I00OIl(), ol0O0iI0l0O.I00iiI()));
                    }
/* 89 */            IioIoO10iOiI.I000OiO("Not a readonly collection: ", oI000ilOol);
/* 9 */             return null;
                }

                @Override
                public final O0Io01100Ilo I0000oI00(Oo0100oi oo0100oi) {
/* 13 */            IiO11ii iiO11ii = new IiO11ii(I000oI1ioi(oo0100oi), oo0100oi.I00iio, oo0100oi.I00ilI0I1, oo0100oi.I00iiI);
/* 29 */            iiO11ii.I00o0l1o1o0 = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new I01iiIii10O(iiO11ii, 10));
/* 31 */            VarHandle.storeStoreFence();
/* 49 */            return iiO11ii;
                }

                @Override
                public final O0Io0Io I0001Ioi1lo(OI100OO1 oi100oo1) {
/* 13 */            IiO1IIi11o iiO1IIi11o = new IiO1IIi11o(I000oI1ioi(oi100oo1), oi100oo1.I00iio, oi100oo1.I00ilI0I1, oi100oo1.I00iiI);
/* 29 */            iiO1IIi11o.I00o0l1o1o0 = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new I01iiIii10O(iiO1IIi11o, 11));
/* 31 */            VarHandle.storeStoreFence();
/* 49 */            return iiO1IIi11o;
                }

                @Override
                public final O0Iooi01 I000II(O0l0IOol0 o0l0IOol0) {
/* 13 */            return new IiOIOIli(I000oI1ioi(o0l0IOol0), o0l0IOol0.I00iio, o0l0IOol0.I00ilI0I1, o0l0IOol0.I00iiI);
                }

                @Override
                public final O0Iooi0Io11I I000O01llI0(OOOOIO0i oOOOIO0i) {
/* 13 */            return new IiOIl1III0l(I000oI1ioi(oOOOIO0i), oOOOIO0i.I00iio, oOOOIO0i.I00ilI0I1, oOOOIO0i.I00iiI);
                }

                @Override
                public final O0O000oI I000OOo1O(OOOOIOiI0 oOOOIOiI0) {
/* 14 */            IiOO0Il iiOO0Il = new IiOO0Il(I000oI1ioi(oOOOIOiI0), oOOOIOiI0.I00iio, oOOOIOiI0.I00ilI0I1, null, IIiO01.I00iiI);
/* 17 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 29 */            iiOO0Il.I00o0iI0io1 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IiOIoOll(iiOO0Il, 0));
/* 37 */            l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IiOIoOll(iiOO0Il, 1));
/* 40 */            VarHandle.storeStoreFence();
/* 49 */            return iiOO0Il;
                }

                /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I000OiO(Illl0OO0l illl0OO0l) throws IOException {
                    IiO11010IiO iiO11010IiO;
/* 11 */            Metadata metadata = (Metadata) illl0OO0l.getClass().getAnnotation(Metadata.class);
/* 15 */            Object obj = null;
/* 16 */            if (metadata == null) {
/* 18 */                iiO11010IiO = null;
                    } else {
/* 20 */                String[] strArrD1 = metadata.d1();
/* 25 */                if (strArrD1.length == 0) {
/* 27 */                    strArrD1 = null;
                        }
/* 28 */                if (strArrD1 != null) {
/* 31 */                    String[] strArrD2 = metadata.d2();
/* 35 */                    Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 43 */                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(II0lIIl1l.I00000oIO(strArrD1));
/* 46 */                    O0I1iO11I0l o0I1iO11I0lI0001Ioi1lo = O0IO00o0OI0.I0001Ioi1lo(byteArrayInputStream, strArrD2);
/* 54 */                    I01Ilioliio i01IlioliioI00000oOI = OOOll1o0.I00oliIiO01i.I00000oOI(byteArrayInputStream, O0IO00o0OI0.I00000oIO);
/* 62 */                    if (!i01IlioliioI00000oOI.I00000oOI()) {
/* 239 */                       O001110li o001110li = new O001110li(new IOiIIo1l().getMessage());
/* 242 */                       o001110li.I00iOIl = i01IlioliioI00000oOI;
/* 966 */                       throw o001110li;
                            }
/* 65 */                    OOOll1o0 oOOll1o0 = (OOOll1o0) i01IlioliioI00000oOI;
/* 110 */                   iiO11010IiO = new IiO11010IiO(Il00iliIIOii.I00iiI, (Ol0IioOo) Oolli0oi0.I0000O(illl0OO0l.getClass(), oOOll1o0, o0I1iO11I0lI0001Ioi1lo, new Oi0Oooi(oOOll1o0.I00o101lO), new O1lili011o(metadata.mv(), (metadata.xi() & 8) != 0), OOoOOlilo11.I00ioIO));
                        }
                    }
/* 113 */           if (iiO11010IiO == null) {
/* 223 */               return super.I000OiO(illl0OO0l);
                    }
/* 117 */           StringBuilder sb = new StringBuilder();
/* 126 */           Iterator it = iiO11010IiO.I000II().iterator();
/* 130 */           boolean z = false;
/* 131 */           Object obj2 = null;
                    while (true) {
/* 136 */               if (it.hasNext()) {
/* 138 */                   Object next = it.next();
/* 151 */                   if (((IiO1l1i) ((O0IooIIl00) next)).I00iiO == O0Ioo0o.I00iiO) {
/* 153 */                       if (z) {
                                    break;
                                }
/* 156 */                       z = true;
/* 157 */                       obj2 = next;
                            }
                        } else if (z) {
/* 162 */                   obj = obj2;
                        }
                    }
/* 163 */           O0IooIIl00 o0IooIIl00 = (O0IooIIl00) obj;
/* 165 */           if (o0IooIIl00 != null) {
/* 177 */               sb.append(Io1Oioii1111.I000lI(((IiO1l1i) o0IooIIl00).I000l1(), false));
/* 182 */               sb.append(".");
                    }
/* 199 */           IOOi0Ool1i.I00IioO0OiOi(l0OoioOl1l0.I00000oIO(iiO11010IiO), sb, ", ", "(", ")", OOo1l011.I00ilO0, 48);
/* 204 */           sb.append(" -> ");
/* 215 */           sb.append(Io1Oioii1111.I000lI(iiO11010IiO.I0001Ioi1lo(), false));
/* 218 */           return sb.toString();
                }

                @Override
                public final String I000iOII(O0iO10011II o0iO10011II) {
/* 1 */             return I000OiO(o0iO10011II);
                }

                @Override
                public final O0O01O0o I000lI(O0IiIl0il o0IiIl0il, List list, boolean z) {
/* 4 */             if (!(o0IiIl0il instanceof IOIO10iOi1)) {
/* 91 */                return l0i10lIio.I0000Il00O(o0IiIl0il, list, z, Collections.EMPTY_LIST, null);
                    }
/* 8 */             Class clsI001l0I00 = ((IOIO10iOi1) o0IiIl0il).I001l0I00();
/* 12 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = IIi1olo.I00000oIO;
/* 18 */            if (list.isEmpty()) {
                        return z ? (O0O01O0o) IIi1olo.I0000O.I00IoIO0lI(clsI001l0I00) : (O0O01O0o) IIi1olo.I0000Il00O.I00IoIO0lI(clsI001l0I00);
                    }
/* 46 */            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) IIi1olo.I0000oI00.I00IoIO0lI(clsI001l0I00);
/* 54 */            OIoi0IIoi oIoi0IIoi = new OIoi0IIoi(list, Boolean.valueOf(z));
/* 57 */            Object obj = concurrentHashMap.get(oIoi0IIoi);
/* 61 */            if (obj == null) {
/* 73 */                I011olOoO i011olOoOI0000Il00O = l0i10lIio.I0000Il00O((O0Ii1IOoiO) IIi1olo.I00000oIO.I00IoIO0lI(clsI001l0I00), list, z, Il01100l.I00iOIl, null);
/* 77 */                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(oIoi0IIoi, i011olOoOI0000Il00O);
/* 85 */                obj = objPutIfAbsent == null ? i011olOoOI0000Il00O : objPutIfAbsent;
                    }
/* 86 */            return (O0O01O0o) obj;
                }

                @Override
                public final O0O0OIOO I000o00OoI0I(O0IOli0o0 o0IOli0o0) {
                    List<O0O0OIOO> typeParameters;
/* 2 */             if (o0IOli0o0 != null) {
/* 4 */                 typeParameters = o0IOli0o0.getTypeParameters();
                    } else {
/* 11 */                if (!(o0IOli0o0 instanceof O0IOl1llI1I)) {
/* 57 */                    IioIoO10iOiI.I000OiO("Type parameter container must be a class or a callable: ", o0IOli0o0);
/* 1 */                     return null;
                        }
/* 16 */                typeParameters = ((O0IOl1llI1I) o0IOli0o0).getTypeParameters();
                    }
/* 28 */            for (O0O0OIOO o0o0oioo : typeParameters) {
/* 46 */                if (o0o0oioo.getName().equals("PluginConfigT")) {
/* 48 */                    return o0o0oioo;
                        }
                    }
/* 51 */            IioIoO10iOiI.I000OiO("Type parameter PluginConfigT is not found in container: ", o0IOli0o0);
/* 1 */             return null;
                }

                @Override
/* 88 */        public final void I000l1(O0O0OIOO o0o0oioo, List list) {
                }
            }
