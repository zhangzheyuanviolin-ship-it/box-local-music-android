            package p000;

            import androidx.work.impl.model.RawWorkInfoDao;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import java.util.TreeMap;
            
            public final class OOlIiOOO0l implements RawWorkInfoDao {
                public Oi1oIiOiIi0 I00000oIO;

                public final void I00000oIO(Olil0III olil0III, I1Io0i0II i1Io0i0II) {
/* 5 */             I1Illo1io0 i1Illo1io0 = (I1Illo1io0) i1Io0i0II.keySet();
/* 7 */             I1Io0i0II i1Io0i0II2 = i1Illo1io0.I00iOIl;
/* 13 */            if (i1Io0i0II2.isEmpty()) {
/* 15 */                return;
                    }
/* 21 */            if (i1Io0i0II.I00iiO > 999) {
/* 25 */                OOlIiIiO oOlIiIiO = new OOlIiIiO(0);
/* 28 */                oOlIiIiO.I00iiI = this;
/* 30 */                oOlIiIiO.I00iiO = olil0III;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                lIo0olIlI1i.I00000oIO(i1Io0i0II, oOlIiIiO);
/* 38 */                return;
                    }
/* 41 */            StringBuilder sb = new StringBuilder();
/* 46 */            sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
/* 51 */            lOi01iio0o.I00000oIO(i1Io0i0II2.I00iiO, sb);
/* 56 */            sb.append(")");
/* 63 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO(sb.toString());
/* 67 */            Iterator it = i1Illo1io0.iterator();
/* 72 */            int i = 1;
                    while (true) {
/* 74 */                I1IlliII1i i1IlliII1i = (I1IlliII1i) it;
/* 80 */                if (!i1IlliII1i.hasNext()) {
                            try {
                                break;
                            } finally {
/* 144 */                       oiIIl0O1l0lI00000oIO.close();
                            }
                        } else {
/* 88 */                    oiIIl0O1l0lI00000oIO.I00Io1o110i(i, (String) i1IlliII1i.next());
/* 91 */                    i++;
                        }
                    }
/* 95 */            int iI00000oIO = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "work_spec_id");
/* 100 */           if (iI00000oIO == -1) {
/* 105 */               return;
                    }
/* 110 */           while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 120 */               List list = (List) i1Io0i0II.get(oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO));
/* 122 */               if (list != null) {
/* 124 */                   byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(0);
/* 128 */                   Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 134 */                   list.add(il01ool0o.I00000oIO(blob));
                        }
                    }
                }

                public final void I00000oOI(Olil0III olil0III, I1Io0i0II i1Io0i0II) {
/* 5 */             I1Illo1io0 i1Illo1io0 = (I1Illo1io0) i1Io0i0II.keySet();
/* 7 */             I1Io0i0II i1Io0i0II2 = i1Illo1io0.I00iOIl;
/* 13 */            if (i1Io0i0II2.isEmpty()) {
/* 15 */                return;
                    }
/* 21 */            if (i1Io0i0II.I00iiO > 999) {
/* 25 */                OOlIiIiO oOlIiIiO = new OOlIiIiO(1);
/* 28 */                oOlIiIiO.I00iiI = this;
/* 30 */                oOlIiIiO.I00iiO = olil0III;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                lIo0olIlI1i.I00000oIO(i1Io0i0II, oOlIiIiO);
/* 38 */                return;
                    }
/* 41 */            StringBuilder sb = new StringBuilder();
/* 46 */            sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
/* 51 */            lOi01iio0o.I00000oIO(i1Io0i0II2.I00iiO, sb);
/* 56 */            sb.append(")");
/* 63 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO(sb.toString());
/* 67 */            Iterator it = i1Illo1io0.iterator();
/* 71 */            int i = 1;
                    while (true) {
/* 73 */                I1IlliII1i i1IlliII1i = (I1IlliII1i) it;
/* 79 */                if (!i1IlliII1i.hasNext()) {
                            try {
                                break;
                            } finally {
/* 138 */                       oiIIl0O1l0lI00000oIO.close();
                            }
                        } else {
/* 87 */                    oiIIl0O1l0lI00000oIO.I00Io1o110i(i, (String) i1IlliII1i.next());
/* 90 */                    i++;
                        }
                    }
/* 94 */            int iI00000oIO = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "work_spec_id");
/* 99 */            if (iI00000oIO == -1) {
/* 104 */               return;
                    }
/* 109 */           while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 119 */               List list = (List) i1Io0i0II.get(oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO));
/* 121 */               if (list != null) {
/* 128 */                   list.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                        }
                    }
                }

                @Override
                public final List getWorkInfoPojos(OlilI1O olilI1O) {
/* 1 */             TreeMap treeMap = Oi1oO0O0.I00ioIO;
/* 7 */             OlOO1i11110 olOO1i11110I00000oIO = lIolIIooo0.I00000oIO(olilI1O).I00000oIO();
/* 13 */            String str = (String) olOO1i11110I00000oIO.I00iiI;
/* 15 */            Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 20 */            OOlIOol oOlIOol = new OOlIOol(0);
/* 23 */            oOlIOol.I00iiI = str;
/* 25 */            oOlIOol.I00iiO = olOO1i11110I00000oIO;
/* 27 */            oOlIOol.I00iio = this;
/* 29 */            VarHandle.storeStoreFence();
/* 37 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, oOlIOol);
                }

                @Override
                public final IlOil1ii getWorkInfoPojosFlow(OlilI1O olilI1O) {
/* 1 */             TreeMap treeMap = Oi1oO0O0.I00ioIO;
/* 7 */             OlOO1i11110 olOO1i11110I00000oIO = lIolIIooo0.I00000oIO(olilI1O).I00000oIO();
/* 13 */            String str = (String) olOO1i11110I00000oIO.I00iiI;
/* 30 */            OOlIOol oOlIOol = new OOlIOol(1);
/* 33 */            oOlIOol.I00iiI = str;
/* 35 */            oOlIOol.I00iiO = olOO1i11110I00000oIO;
/* 37 */            oOlIOol.I00iio = this;
/* 39 */            VarHandle.storeStoreFence();
/* 43 */            return ilOooi01I.I00000oIO(this.I00000oIO, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, oOlIOol);
                }

                @Override
                public final O110lI getWorkInfoPojosLiveData(OlilI1O olilI1O) {
/* 1 */             TreeMap treeMap = Oi1oO0O0.I00ioIO;
/* 7 */             OlOO1i11110 olOO1i11110I00000oIO = lIolIIooo0.I00000oIO(olilI1O).I00000oIO();
/* 13 */            String str = (String) olOO1i11110I00000oIO.I00iiI;
/* 34 */            OOlIOol oOlIOol = new OOlIOol(2);
/* 37 */            oOlIOol.I00iiI = str;
/* 39 */            oOlIOol.I00iiO = olOO1i11110I00000oIO;
/* 41 */            oOlIOol.I00iio = this;
/* 43 */            VarHandle.storeStoreFence();
/* 47 */            return this.I00000oIO.I0001Ioi1lo().I00000oIO(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, oOlIOol);
                }
            }
