            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class lOii0ii1111o {
                /* JADX WARN: Code restructure failed: missing block: B:67:0x01da, code lost:
                
                    r0 = p000.Oio0lI.I00000oIO(r8);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x01de, code lost:
                
                    p000.iOOl00.I00000oIO(r2, null);
                    r10 = r0;
                 */
                /* JADX WARN: Finally extract failed */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Olo01l I00000oIO(Olil0III olil0III, String str) {
                    Map mapI00000oOI;
                    Oilolol11I oilolol11I;
/* 24 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("PRAGMA table_info(`" + str + "`)");
                    try {
/* 32 */                long j = 0;
/* 37 */                if (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 49 */                    int iI00000oIO = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "name");
/* 55 */                    int iI00000oIO2 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "type");
/* 61 */                    int iI00000oIO3 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "notnull");
/* 67 */                    int iI00000oIO4 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "pk");
/* 73 */                    int iI00000oIO5 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "dflt_value");
/* 79 */                    O1OOII o1ooii = new O1OOII();
/* 143 */                   do {
/* 82 */                        String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO);
/* 136 */                       o1ooii.put(strI00i0O, new Olo000(strI00i0O, oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO2), oiIIl0O1l0lI00000oIO.getLong(iI00000oIO3) != 0, (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO4), oiIIl0O1l0lI00000oIO.isNull(iI00000oIO5) ? null : oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO5), 2));
/* 143 */                   } while (oiIIl0O1l0lI00000oIO.I00ol1());
/* 145 */                   mapI00000oOI = o1ooii.I00000oOI();
/* 149 */                   iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
                        } else {
/* 39 */                    mapI00000oOI = Il011I1OiO0I.I00iOIl;
/* 41 */                    iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
                        }
/* 169 */               oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("PRAGMA foreign_key_list(`" + str + "`)");
                        try {
/* 175 */                   int iI00000oIO6 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 181 */                   int iI00000oIO7 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "seq");
/* 187 */                   int iI00000oIO8 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "table");
/* 193 */                   int iI00000oIO9 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "on_delete");
/* 199 */                   int iI00000oIO10 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "on_update");
/* 203 */                   List listI00000oIO = lO0oII.I00000oIO(oiIIl0O1l0lI00000oIO);
/* 207 */                   oiIIl0O1l0lI00000oIO.reset();
/* 212 */                   Oilolol11I oilolol11I2 = new Oilolol11I();
/* 219 */                   while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 227 */                       if (oiIIl0O1l0lI00000oIO.getLong(iI00000oIO7) == j) {
/* 234 */                           int i = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO6);
/* 237 */                           ArrayList arrayList = new ArrayList();
/* 242 */                           ArrayList arrayList2 = new ArrayList();
/* 249 */                           int i2 = iI00000oIO6;
/* 253 */                           ArrayList arrayList3 = new ArrayList();
/* 264 */                           for (Object obj : listI00000oIO) {
/* 266 */                               int i3 = iI00000oIO7;
/* 272 */                               List list = listI00000oIO;
/* 279 */                               if (((Ililil0o1) obj).I00iOIl == i) {
/* 281 */                                   arrayList3.add(obj);
                                        }
/* 284 */                               iI00000oIO7 = i3;
/* 286 */                               listI00000oIO = list;
                                    }
/* 293 */                           int i4 = iI00000oIO7;
/* 295 */                           List list2 = listI00000oIO;
/* 297 */                           Iterator it = arrayList3.iterator();
/* 305 */                           while (it.hasNext()) {
/* 311 */                               Ililil0o1 ililil0o1 = (Ililil0o1) it.next();
/* 315 */                               arrayList.add(ililil0o1.I00iiO);
/* 320 */                               arrayList2.add(ililil0o1.I00iio);
                                    }
/* 347 */                           oilolol11I2.add(new Olo001I0l(oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO8), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO9), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO10), arrayList, arrayList2));
/* 350 */                           iI00000oIO6 = i2;
/* 352 */                           iI00000oIO7 = i4;
/* 354 */                           listI00000oIO = list2;
/* 356 */                           j = 0;
                                }
                            }
/* 361 */                   Oilolol11I oilolol11II00000oIO = Oio0lI.I00000oIO(oilolol11I2);
/* 366 */                   iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 386 */                   oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("PRAGMA index_list(`" + str + "`)");
                            try {
/* 390 */                       int iI00000oIO11 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "name");
/* 396 */                       int iI00000oIO12 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "origin");
/* 402 */                       int iI00000oIO13 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "unique");
/* 407 */                       if (iI00000oIO11 == -1 || iI00000oIO12 == -1 || iI00000oIO13 == -1) {
/* 485 */                           iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 488 */                           oilolol11I = null;
                                } else {
/* 417 */                           Oilolol11I oilolol11I3 = new Oilolol11I();
                                    while (true) {
/* 424 */                               if (!oiIIl0O1l0lI00000oIO.I00ol1()) {
                                            break;
                                        }
/* 436 */                               if ("c".equals(oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO12))) {
/* 456 */                                   Olo001i0l1 olo001i0l1I00000oOI = lO0oII.I00000oOI(olil0III, oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO11), oiIIl0O1l0lI00000oIO.getLong(iI00000oIO13) == 1);
/* 460 */                                   if (olo001i0l1I00000oOI == null) {
/* 463 */                                       iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 466 */                                       oilolol11I = null;
                                                break;
                                            }
/* 468 */                                   oilolol11I3.add(olo001i0l1I00000oOI);
                                        }
                                    }
                                }
/* 491 */                       return new Olo01l(str, mapI00000oOI, oilolol11II00000oIO, oilolol11I);
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
/* 501 */                       throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
/* 507 */                   throw th;
                        } finally {
                        }
                    }
                }
            }
