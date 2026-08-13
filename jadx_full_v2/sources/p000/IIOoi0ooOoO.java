            package p000;

            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public class IIOoi0ooOoO extends IIOoOiOI {
                public Map I00iOIl = new Ol1I1i1();

                public static String I00ooIo0(IIOoOiOI iIOoOiOI, ArrayList arrayList) throws IOException {
/* 1 */             if (iIOoOiOI == null) {
/* 3 */                 return "null";
                    }
/* 10 */            if (arrayList.contains(iIOoOiOI)) {
/* 16 */                return String.valueOf(iIOoOiOI.hashCode());
                    }
/* 21 */            arrayList.add(iIOoOiOI);
/* 30 */            if (!(iIOoOiOI instanceof IIOoi0ooOoO)) {
/* 143 */               if (!(iIOoOiOI instanceof IIOoIilO)) {
/* 193 */                   if (!(iIOoOiOI instanceof IIi0O10I)) {
/* 221 */                       return iIOoOiOI.toString();
                            }
/* 216 */                   return "COSObject{" + I00ooIo0(((IIi0O10I) iIOoOiOI).I00iOIl, arrayList) + "}";
                        }
/* 149 */               StringBuilder sb = new StringBuilder("COSArray{");
/* 156 */               Iterator it = ((IIOoIilO) iIOoOiOI).I00iOIl.iterator();
/* 164 */               while (it.hasNext()) {
/* 176 */                   sb.append(I00ooIo0((IIOoOiOI) it.next(), arrayList));
/* 179 */                   sb.append(";");
                        }
/* 183 */               sb.append("}");
/* 186 */               return sb.toString();
                    }
/* 36 */            StringBuilder sb2 = new StringBuilder("COSDictionary{");
/* 56 */            for (Map.Entry entry : ((IIOoi0ooOoO) iIOoOiOI).I00iOIl.entrySet()) {
/* 68 */                sb2.append(entry.getKey());
/* 73 */                sb2.append(":");
/* 86 */                sb2.append(I00ooIo0((IIOoOiOI) entry.getValue(), arrayList));
/* 89 */                sb2.append(";");
                    }
/* 93 */            sb2.append("}");
/* 98 */            if (iIOoOiOI instanceof IIi0io1lIo) {
/* 102 */               OOl1ilO oOl1ilOI010lI0oi = ((IIi0io1lIo) iIOoOiOI).I010lI0oi();
/* 108 */               ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 111 */               io0iolo.I0000Il00O(oOl1ilOI010lI0oi, byteArrayOutputStream);
/* 114 */               byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 120 */               sb2.append("COSStream{");
/* 127 */               sb2.append(Arrays.hashCode(byteArray));
/* 130 */               sb2.append("}");
/* 133 */               oOl1ilOI010lI0oi.close();
                    }
/* 136 */           return sb2.toString();
                }

                public final void I00ioIO(IIOoi0ooOoO iIOoi0ooOoO) {
/* 1 */             Map map = this.I00iOIl;
/* 5 */             if (map instanceof Ol1I1i1) {
/* 22 */                if (iIOoi0ooOoO.I00iOIl.size() + ((Ol1I1i1) map).size() >= 1000) {
/* 31 */                    this.I00iOIl = new LinkedHashMap(this.I00iOIl);
                        }
                    }
/* 37 */            this.I00iOIl.putAll(iIOoi0ooOoO.I00iOIl);
                }

                public final boolean I00l0I0l0lO1(IIi0I0I0o iIi0I0I0o, boolean z) {
/* 2 */             IIOoOiOI iIOoOiOII00oliIiO01i = I00oliIiO01i(iIi0I0I0o, null);
                    return iIOoOiOII00oliIiO01i instanceof IIOoOl1o1 ? iIOoOiOII00oliIiO01i == IIOoOl1o1.I00iiI : z;
                }

                public final IIOoIilO I00lli11(IIi0I0I0o iIi0I0I0o) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = I00oII(iIi0I0I0o);
/* 7 */             if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 9 */                 return (IIOoIilO) iIOoOiOII00oII;
                    }
/* 12 */            return null;
                }

                public final IIOoi0ooOoO I00lll10(IIi0I0I0o iIi0I0I0o) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = I00oII(iIi0I0I0o);
/* 7 */             if (iIOoOiOII00oII instanceof IIOoi0ooOoO) {
/* 9 */                 return (IIOoi0ooOoO) iIOoOiOII00oII;
                    }
/* 12 */            return null;
                }

                public final IIi0I0I0o I00o0iI0io1(IIi0I0I0o iIi0I0I0o) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = I00oII(iIi0I0I0o);
/* 7 */             if (iIOoOiOII00oII instanceof IIi0I0I0o) {
/* 9 */                 return (IIi0I0I0o) iIOoOiOII00oII;
                    }
/* 12 */            return null;
                }

                public final IIOoOiOI I00oII(IIi0I0I0o iIi0I0I0o) {
/* 7 */             IIOoOiOI iIOoOiOI = (IIOoOiOI) this.I00iOIl.get(iIi0I0I0o);
/* 11 */            if (iIOoOiOI instanceof IIi0O10I) {
/* 15 */                iIOoOiOI = ((IIi0O10I) iIOoOiOI).I00iOIl;
                    }
/* 19 */            if (iIOoOiOI instanceof IIi0II0l0o) {
/* 21 */                return null;
                    }
/* 49 */            return iIOoOiOI;
                }

                public final IIOoOiOI I00oliIiO01i(IIi0I0I0o iIi0I0I0o, IIi0I0I0o iIi0I0I0o2) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = I00oII(iIi0I0I0o);
                    return (iIOoOiOII00oII != null || iIi0I0I0o2 == null) ? iIOoOiOII00oII : I00oII(iIi0I0I0o2);
                }

                public final IIOoOiOI I00oo1iO0ll(String str) {
/* 5 */             return I00oII(IIi0I0I0o.I00ioIO(str));
                }

                public final float I00ooiO1I(IIi0I0I0o iIi0I0I0o, float f) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = I00oII(iIi0I0I0o);
                    return iIOoOiOII00oII instanceof IIi0IoOo ? ((IIi0IoOo) iIOoOiOII00oII).I00ioIO() : f;
                }

                public final int I00oooO(IIi0I0I0o iIi0I0I0o, IIi0I0I0o iIi0I0I0o2, int i) {
/* 1 */             IIOoOiOI iIOoOiOII00oliIiO01i = I00oliIiO01i(iIi0I0I0o, iIi0I0I0o2);
                    return iIOoOiOII00oliIiO01i instanceof IIi0IoOo ? ((IIi0IoOo) iIOoOiOII00oliIiO01i).I00lli11() : i;
                }

                public final IIOoOiOI I0100i(IIi0I0I0o iIi0I0I0o) {
/* 7 */             return (IIOoOiOI) this.I00iOIl.get(iIi0I0I0o);
                }

                public final long I0100o111I(IIi0I0I0o iIi0I0I0o) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = I00oII(iIi0I0I0o);
/* 7 */             if (iIOoOiOII00oII instanceof IIi0IoOo) {
/* 11 */                return ((IIi0IoOo) iIOoOiOII00oII).I00lll10();
                    }
/* 16 */            return -1L;
                }

                public final String I010101Oo1lO(IIi0I0I0o iIi0I0I0o) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = I00oII(iIi0I0I0o);
/* 7 */             if (iIOoOiOII00oII instanceof IIi0I0I0o) {
/* 11 */                return ((IIi0I0I0o) iIOoOiOII00oII).I00iOIl;
                    }
/* 16 */            if (iIOoOiOII00oII instanceof IIi0l1) {
/* 20 */                return ((IIi0l1) iIOoOiOII00oII).I00ioIO();
                    }
/* 25 */            return null;
                }

                public final String I010I0(IIi0I0I0o iIi0I0I0o) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = I00oII(iIi0I0I0o);
/* 7 */             if (iIOoOiOII00oII instanceof IIi0l1) {
/* 11 */                return ((IIi0l1) iIOoOiOII00oII).I00ioIO();
                    }
/* 16 */            return null;
                }

                public final void I010II(IIi0I0I0o iIi0I0I0o) {
/* 3 */             this.I00iOIl.remove(iIi0I0I0o);
                }

                public final void I010OIo1l(IIi0I0I0o iIi0I0I0o, float f) {
/* 6 */             I010iIIOlo(iIi0I0I0o, new IIOolo0l(f));
                }

                public final void I010i10l(IIi0I0I0o iIi0I0I0o, int i) {
/* 6 */             I010iIIOlo(iIi0I0I0o, IIOool.I00o0iI0io1(i));
                }

                public final void I010iIIOlo(IIi0I0I0o iIi0I0I0o, IIOoOiOI iIOoOiOI) {
/* 1 */             if (iIOoOiOI == null) {
/* 3 */                 I010II(iIi0I0I0o);
/* 6 */                 return;
                    }
/* 7 */             Map map = this.I00iOIl;
/* 11 */            if ((map instanceof Ol1I1i1) && ((Ol1I1i1) map).size() >= 1000) {
/* 30 */                this.I00iOIl = new LinkedHashMap(this.I00iOIl);
                    }
/* 34 */            this.I00iOIl.put(iIi0I0I0o, iIOoOiOI);
                }

                public final void I010ioo(IIi0I0I0o iIi0I0I0o, IIi0O1OOO1i0 iIi0O1OOO1i0) {
/* 9 */             I010iIIOlo(iIi0I0I0o, iIi0O1OOO1i0 != null ? iIi0O1OOO1i0.I00Io1lO() : null);
                }

                public final void I010l10O(IIi0I0I0o iIi0I0I0o, String str) {
/* 9 */             I010iIIOlo(iIi0I0I0o, str != null ? IIi0I0I0o.I00ioIO(str) : null);
                }

                public final void I010l1O(IIi0I0I0o iIi0I0I0o, String str) {
/* 10 */            I010iIIOlo(iIi0I0I0o, str != null ? new IIi0l1(str) : null);
                }

                public final String toString() {
                    try {
/* 6 */                 return I00ooIo0(this, new ArrayList());
                    } catch (IOException e) {
/* 31 */                return "COSDictionary{" + e.getMessage() + "}";
                    }
                }
            }
