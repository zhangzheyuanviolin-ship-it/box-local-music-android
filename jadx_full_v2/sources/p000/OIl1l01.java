            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            
            public final class OIl1l01 implements AutoCloseable {
                public final IOO1lioOO I00iOIl;
                public final OIl1lOoO1 I00iiI;
                public boolean I00iio;
                public final Object I00iiO = new Object();
                public long I00ilI0I1 = 1;
                public long I00ilO0 = Long.MIN_VALUE;
                public long I00io1l = Long.MIN_VALUE;
                public long I00ioIO = Long.MIN_VALUE;
                public long I00l0I0l0lO1 = Long.MIN_VALUE;
                public final ArrayList I00l0OO0IO = new ArrayList();
                public final LinkedHashMap I00li1OI = new LinkedHashMap();

                public OIl1l01(IOO1lioOO iOO1lioOO, OIl1lOoO1 oIl1lOoO1) {
/* 4 */             this.I00iOIl = iOO1lioOO;
/* 6 */             this.I00iiI = oIl1lOoO1;
                }

                public final void I00000oIO(long j) {
                    synchronized (this.I00iiO) {
                        try {
/* 6 */                     if (this.I00iio) {
/* 9 */                         return;
                            }
/* 10 */                    this.I00ioIO = j;
/* 14 */                    Iterator it = this.I00l0OO0IO.iterator();
/* 19 */                    OIl1OoIo1 oIl1OoIo1 = null;
/* 20 */                    boolean z = false;
/* 21 */                    Object obj = null;
                            while (true) {
/* 26 */                        if (it.hasNext()) {
/* 28 */                            Object next = it.next();
/* 45 */                            if (((OIl1OoIo1) next).I00000oOI == j) {
/* 47 */                                if (z) {
                                            break;
                                        }
/* 51 */                                obj = next;
/* 52 */                                z = true;
                                    }
                                } else if (!z) {
                                }
                            }
/* 49 */                    obj = null;
/* 59 */                    OIl1OoIo1 oIl1OoIo12 = (OIl1OoIo1) obj;
/* 61 */                    if (oIl1OoIo12 != null) {
/* 65 */                        this.I00l0I0l0lO1 = oIl1OoIo12.I0000oI00;
/* 69 */                        this.I00l0OO0IO.remove(oIl1OoIo12);
/* 72 */                        oIl1OoIo1 = oIl1OoIo12;
                            }
/* 74 */                    if (oIl1OoIo1 != null) {
/* 84 */                        oIl1OoIo1.I00000oIO(-1L, OIlI0iOIo.I00000oIO(10));
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                public final void I0000Il00O(long j, Object obj) throws Exception {
                    OIl1l01 oIl1l01;
                    Object objI00000oIO;
                    ArrayList<OIl1OoIo1> arrayList;
                    Object next;
                    synchronized (this.I00iiO) {
                        try {
/* 7 */                     if (this.I00iio || this.I00iiI.I00000oIO(this.I00l0I0l0lO1, j)) {
/* 19 */                        oIl1l01 = this;
/* 139 */                       objI00000oIO = OIl1lo10.I00000oIO(obj);
                            } else {
/* 24 */                        Iterator it = this.I00l0OO0IO.iterator();
                                while (true) {
/* 32 */                            if (it.hasNext()) {
/* 34 */                                next = it.next();
/* 49 */                                if (this.I00iiI.I00000oIO(((OIl1OoIo1) next).I0000oI00, j)) {
                                            break;
                                        }
                                    } else {
/* 56 */                                next = null;
                                        break;
                                    }
                                }
/* 57 */                        OIl1OoIo1 oIl1OoIo1 = (OIl1OoIo1) next;
/* 59 */                        if (oIl1OoIo1 != null) {
/* 67 */                            oIl1l01 = this;
/* 68 */                            ArrayList arrayListI000O01llI0 = oIl1l01.I000O01llI0(oIl1OoIo1.I0000O, oIl1OoIo1.I0000oI00, oIl1OoIo1.I00000oIO);
/* 72 */                            oIl1OoIo1.I00000oIO(j, obj);
/* 77 */                            oIl1l01.I00l0OO0IO.remove(oIl1OoIo1);
/* 80 */                            arrayList = arrayListI000O01llI0;
/* 81 */                            objI00000oIO = null;
                                } else {
/* 83 */                            oIl1l01 = this;
/* 94 */                            oIl1l01.I00li1OI.put(Long.valueOf(j), OIl1lo10.I00000oIO(obj));
/* 104 */                           if (oIl1l01.I00li1OI.size() > 3) {
/* 130 */                               objI00000oIO = oIl1l01.I00li1OI.remove(Long.valueOf(((Number) IOOi0Ool1i.I001lIiIIo1O(oIl1l01.I00li1OI.keySet())).longValue()));
                                    } else {
/* 136 */                               objI00000oIO = null;
/* 137 */                               arrayList = null;
                                    }
                                }
                            }
/* 134 */                   arrayList = null;
                        } catch (Throwable th) {
/* 332 */                   throw th;
                        }
                    }
/* 145 */           OIl1lo10 oIl1lo10 = (OIl1lo10) objI00000oIO;
/* 147 */           if (oIl1lo10 != null) {
/* 149 */               Object obj2 = oIl1lo10.I00000oIO;
/* 155 */               Object obj3 = OIl1lo10.I00000oOI(obj2) ? obj2 : null;
/* 158 */               if (obj3 != null) {
/* 162 */                   oIl1l01.I00iOIl.I00000oIO(obj3);
                        }
                    }
/* 165 */           if (arrayList != null) {
/* 175 */               for (OIl1OoIo1 oIl1OoIo12 : arrayList) {
/* 183 */                   oIl1OoIo12.getClass();
/* 194 */                   oIl1OoIo12.I00000oIO(-1L, OIlI0iOIo.I00000oIO(12));
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01a2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(long j, long j2, long j3, OIl1Oll oIl1Oll) throws Exception {
                    Object next;
                    boolean z;
                    Object next2;
                    OIl1lo10 oIl1lo10;
                    ArrayList<OIl1OoIo1> arrayListI000O01llI0;
                    Object objRemove;
                    boolean z2;
                    Object objI00000oIO;
                    boolean z3;
                    Object next3;
                    synchronized (this.I00iiO) {
                        try {
/* 16 */                    Iterator it = this.I00l0OO0IO.iterator();
                            while (true) {
/* 24 */                        if (it.hasNext()) {
/* 26 */                            next = it.next();
/* 42 */                            if (((OIl1OoIo1) next).I00000oOI == j) {
                                        break;
                                    }
                                } else {
/* 48 */                            next = null;
                                    break;
                                }
                            }
/* 49 */                    OIl1OoIo1 oIl1OoIo1 = (OIl1OoIo1) next;
/* 51 */                    if (oIl1OoIo1 != null) {
/* 124 */                       Log.w("CXCP", "onOutputStarted was invoked multiple times with a previously started output!onOutputStarted with " + ((Object) IllIiOlOoIll.I00000oIO(j)) + ", " + ((Object) ("CameraTimestamp(value=" + j2 + ')')) + ", " + j3 + ". Previously started output: " + oIl1OoIo1 + ". Ignoring.");
/* 128 */                       return;
                            }
/* 129 */                   boolean z4 = this.I00iio;
/* 131 */                   long j4 = this.I00ilI0I1;
/* 137 */                   this.I00ilI0I1 = j4 + 1;
/* 139 */                   if (z4 || this.I00ioIO == j || this.I00l0I0l0lO1 == j3) {
/* 153 */                       z = z4;
/* 314 */                       Iterator it2 = this.I00li1OI.keySet().iterator();
                                while (true) {
/* 322 */                           if (it2.hasNext()) {
/* 324 */                               next2 = it2.next();
/* 341 */                               if (this.I00iiI.I00000oIO(j3, ((Number) next2).longValue())) {
                                            break;
                                        }
                                    } else {
/* 344 */                               next2 = null;
                                        break;
                                    }
                                }
/* 345 */                       Long l = (Long) next2;
/* 358 */                       oIl1lo10 = l != null ? (OIl1lo10) this.I00li1OI.remove(l) : null;
/* 360 */                       arrayListI000O01llI0 = null;
/* 361 */                       objRemove = null;
                            } else {
/* 165 */                       boolean z5 = j < this.I00io1l;
/* 166 */                       if (!z5) {
/* 168 */                           this.I00io1l = j;
                                }
/* 170 */                       boolean z6 = z5;
/* 180 */                       boolean z7 = j3 < this.I00ilO0;
/* 181 */                       if (!z7) {
/* 183 */                           this.I00ilO0 = j3;
                                }
/* 192 */                       boolean z8 = z6 || z7;
/* 201 */                       Iterator it3 = this.I00li1OI.keySet().iterator();
                                while (true) {
/* 209 */                           if (!it3.hasNext()) {
/* 239 */                               z = z4;
/* 241 */                               z3 = false;
/* 243 */                               next3 = null;
                                        break;
                                    } else {
/* 211 */                               next3 = it3.next();
/* 219 */                               z3 = false;
/* 225 */                               z = z4;
/* 233 */                               if (this.I00iiI.I00000oIO(j3, ((Number) next3).longValue())) {
                                            break;
                                        } else {
/* 236 */                                   z4 = z;
                                        }
                                    }
                                }
/* 247 */                       Long l2 = (Long) next3;
/* 249 */                       if (l2 == null) {
/* 269 */                           ArrayList arrayList = this.I00l0OO0IO;
/* 273 */                           OIl1OoIo1 oIl1OoIo12 = new OIl1OoIo1();
/* 276 */                           oIl1OoIo12.I00000oIO = z8;
/* 278 */                           oIl1OoIo12.I00000oOI = j;
/* 280 */                           oIl1OoIo12.I0000Il00O = j2;
/* 282 */                           oIl1OoIo12.I0000O = j4;
/* 284 */                           oIl1OoIo12.I0000oI00 = j3;
/* 286 */                           oIl1OoIo12.I0001Ioi1lo = oIl1Oll;
/* 292 */                           oIl1OoIo12.I000II = iOOOIOoiIlII.I00000oIO(z3);
/* 294 */                           VarHandle.storeStoreFence();
/* 297 */                           arrayList.add(oIl1OoIo12);
/* 300 */                           z2 = z3;
/* 302 */                           arrayListI000O01llI0 = null;
/* 303 */                           oIl1lo10 = null;
/* 304 */                           objRemove = null;
/* 364 */                           if (arrayListI000O01llI0 != null) {
/* 374 */                               for (OIl1OoIo1 oIl1OoIo13 : arrayListI000O01llI0) {
/* 382 */                                   oIl1OoIo13.getClass();
/* 393 */                                   oIl1OoIo13.I00000oIO(-1L, OIlI0iOIo.I00000oIO(12));
                                        }
                                    }
/* 397 */                           if (oIl1lo10 != null) {
/* 399 */                               Object obj = oIl1lo10.I00000oIO;
/* 409 */                               Object obj2 = OIl1lo10.I00000oOI(obj) ? obj : null;
/* 410 */                               if (obj2 != null) {
/* 414 */                                   this.I00iOIl.I00000oIO(obj2);
                                        }
                                    }
/* 417 */                           if (z2) {
/* 444 */                               return;
                                    }
/* 419 */                           if (z) {
/* 423 */                               objI00000oIO = OIlI0iOIo.I00000oIO(11);
                                    } else {
/* 428 */                               OIl1lo10 oIl1lo102 = (OIl1lo10) objRemove;
/* 437 */                               objI00000oIO = oIl1lo102 != null ? oIl1lo102.I00000oIO : OIlI0iOIo.I00000oIO(10);
                                    }
/* 441 */                           oIl1Oll.I00000oOI(objI00000oIO);
/* 444 */                           return;
                                }
/* 253 */                       objRemove = this.I00li1OI.remove(l2);
/* 260 */                       arrayListI000O01llI0 = I000O01llI0(j4, j3, z8);
/* 264 */                       oIl1lo10 = null;
                            }
/* 265 */                   z2 = true;
/* 364 */                   if (arrayListI000O01llI0 != null) {
                            }
/* 397 */                   if (oIl1lo10 != null) {
                            }
/* 417 */                   if (z2) {
                            }
                        } catch (Throwable th) {
/* 1182 */                  throw th;
                        }
                    }
                }

                public final ArrayList I000O01llI0(long j, long j2, boolean z) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             ArrayList arrayList2 = this.I00l0OO0IO;
/* 8 */             Iterator it = arrayList2.iterator();
/* 16 */            while (it.hasNext()) {
/* 18 */                Object next = it.next();
/* 23 */                OIl1OoIo1 oIl1OoIo1 = (OIl1OoIo1) next;
/* 27 */                if (oIl1OoIo1.I00000oIO == z && oIl1OoIo1.I0000O < j && oIl1OoIo1.I0000oI00 < j2) {
/* 41 */                    arrayList.add(next);
                        }
                    }
/* 45 */            arrayList2.removeAll(arrayList);
/* 98 */            return arrayList;
                }

                @Override
                public final void close() throws Exception {
                    synchronized (this.I00iiO) {
/* 6 */                 if (this.I00iio) {
/* 9 */                     return;
                        }
/* 11 */                this.I00iio = true;
/* 21 */                ArrayList arrayList = new ArrayList(this.I00li1OI.values());
/* 26 */                this.I00li1OI.clear();
/* 33 */                ArrayList arrayList2 = new ArrayList(this.I00l0OO0IO);
/* 38 */                this.I00l0OO0IO.clear();
/* 42 */                Iterator it = arrayList.iterator();
/* 50 */                while (it.hasNext()) {
/* 58 */                    Object obj = ((OIl1lo10) it.next()).I00000oIO;
/* 60 */                    IOO1lioOO iOO1lioOO = this.I00iOIl;
/* 66 */                    if (!OIl1lo10.I00000oOI(obj)) {
/* 69 */                        obj = null;
                            }
/* 70 */                    iOO1lioOO.I00000oIO(obj);
                        }
/* 74 */                Iterator it2 = arrayList2.iterator();
/* 82 */                while (it2.hasNext()) {
/* 88 */                    OIl1OoIo1 oIl1OoIo1 = (OIl1OoIo1) it2.next();
/* 90 */                    oIl1OoIo1.getClass();
/* 101 */                   oIl1OoIo1.I00000oIO(-1L, OIlI0iOIo.I00000oIO(11));
                        }
                    }
                }
            }
