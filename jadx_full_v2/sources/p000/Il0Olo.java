            package p000;

            import android.text.TextUtils;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.Dependency;
            import androidx.work.impl.model.DependencyDao;
            import androidx.work.impl.model.WorkName;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.UUID;
            
            public abstract class Il0Olo {
                public static final String I00000oIO = IIi0oIl.I000OiO("EnqueueRunnable");

                public static void I00000oIO(i01I0IOOI10 i01i0iooi10) {
/* 1 */             i01IlOO i01iloo = i01i0iooi10.I00000oIO;
/* 12 */            if (i01I0IOOI10.I00000oOI(i01i0iooi10, new HashSet())) {
/* 53 */                IioIoO10iOiI.I000O01llI0(i01i0iooi10, "WorkContinuation has cycles (", ")");
/* 77 */                return;
                    }
/* 14 */            WorkDatabase workDatabase = i01iloo.I0000Il00O;
/* 16 */            IOllii iOllii = i01iloo.I00000oOI;
/* 18 */            workDatabase.I00000oOI();
                    try {
/* 21 */                ilII0oO0.I00000oIO(workDatabase, iOllii, i01i0iooi10);
/* 24 */                boolean zI00000oOI = I00000oOI(i01i0iooi10);
/* 28 */                workDatabase.I0010o();
/* 34 */                if (zI00000oOI) {
/* 40 */                    OiOIOI.I00000oOI(iOllii, i01iloo.I0000Il00O, i01iloo.I0000oI00);
                        }
                    } finally {
/* 45 */                workDatabase.I000lI();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:94:0x01be  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x01cb  */
                /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I00000oOI(i01I0IOOI10 i01i0iooi10) {
                    boolean zI00000oOI;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    boolean z8;
/* 3 */             List<i01I0IOOI10> list = i01i0iooi10.I000II;
/* 5 */             String str = I00000oIO;
/* 8 */             if (list != null) {
/* 14 */                zI00000oOI = false;
/* 19 */                for (i01I0IOOI10 i01i0iooi102 : list) {
/* 29 */                    if (i01i0iooi102.I000O01llI0) {
/* 68 */                        IIi0oIl.I000II().I000l1(str, "Already enqueued work ids (" + TextUtils.join(", ", i01i0iooi102.I0000oI00) + ")");
                            } else {
/* 35 */                        zI00000oOI |= I00000oOI(i01i0iooi102);
                            }
                        }
                    } else {
/* 72 */                zI00000oOI = false;
                    }
/* 73 */            HashSet hashSetI0000Il00O = i01I0IOOI10.I0000Il00O(i01i0iooi10);
/* 77 */            i01IlOO i01iloo = i01i0iooi10.I00000oIO;
/* 79 */            List<i01OOII> list2 = i01i0iooi10.I0000O;
/* 87 */            String[] strArr = (String[]) hashSetI0000Il00O.toArray(new String[0]);
/* 89 */            String str2 = i01i0iooi10.I00000oOI;
/* 91 */            Il1OO1ilo0o1 il1OO1ilo0o1 = i01i0iooi10.I0000Il00O;
/* 93 */            IOllii iOllii = i01iloo.I00000oOI;
/* 95 */            WorkDatabase workDatabase = i01iloo.I0000Il00O;
/* 99 */            iOllii.I0000O.getClass();
/* 102 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 113 */           boolean z9 = strArr != null && strArr.length > 0;
/* 114 */           if (z9) {
/* 118 */               z2 = false;
/* 120 */               z3 = false;
/* 122 */               z = true;
/* 124 */               for (String str3 : strArr) {
/* 132 */                   WorkSpec workSpec = workDatabase.I001lIiIIo1O().getWorkSpec(str3);
/* 136 */                   if (workSpec == null) {
/* 161 */                       IIi0oIl.I000II().I0000oI00(str, "Prerequisite " + str3 + " doesn't exist; not enqueuing");
                                break;
                            }
/* 168 */                   i01IOiO1lO i01ioio1lo = workSpec.state;
/* 177 */                   z &= i01ioio1lo == i01IOiO1lO.I00iiO;
/* 181 */                   if (i01ioio1lo == i01IOiO1lO.I00iio) {
/* 183 */                       z3 = true;
                            } else if (i01ioio1lo == i01IOiO1lO.I00ilO0) {
/* 190 */                       z2 = true;
                            }
                        }
                    } else {
/* 196 */               z = true;
/* 198 */               z2 = false;
/* 200 */               z3 = false;
                    }
/* 202 */           boolean zIsEmpty = TextUtils.isEmpty(str2);
/* 206 */           if (zIsEmpty || z9) {
/* 447 */               z4 = zIsEmpty;
/* 445 */               z5 = false;
/* 458 */               for (i01OOII i01ooii : list2) {
/* 466 */                   WorkSpec workSpec2 = i01ooii.I00000oOI;
/* 468 */                   UUID uuid = i01ooii.I00000oIO;
/* 470 */                   if (!z9 || z) {
/* 493 */                       workSpec2.lastEnqueueTime = jCurrentTimeMillis;
                            } else if (z3) {
/* 478 */                       workSpec2.state = i01IOiO1lO.I00iio;
                            } else if (z2) {
/* 485 */                       workSpec2.state = i01IOiO1lO.I00ilO0;
                            } else {
/* 490 */                       workSpec2.state = i01IOiO1lO.I00ilI0I1;
                            }
/* 499 */                   if (workSpec2.state == i01IOiO1lO.I00iOIl) {
/* 501 */                       z5 = true;
                            }
/* 510 */                   workDatabase.I001lIiIIo1O().insertWorkSpec(ilII0oO0.I00000oOI(workSpec2));
/* 513 */                   if (z9) {
/* 515 */                       int length = strArr.length;
/* 516 */                       int i = 0;
/* 517 */                       while (i < length) {
/* 536 */                           workDatabase.I001IIilI0O().insertDependency(new Dependency(uuid.toString(), strArr[i]));
/* 539 */                           i++;
/* 541 */                           strArr = strArr;
                                }
                            }
/* 544 */                   String[] strArr2 = strArr;
/* 556 */                   workDatabase.I001lllioOl().insertTags(uuid.toString(), i01ooii.I0000Il00O);
/* 559 */                   if (!z4) {
/* 574 */                       workDatabase.I001iOo1i0O().insert(new WorkName(str2, uuid.toString()));
                            }
/* 577 */                   strArr = strArr2;
                        }
/* 580 */               z6 = z5;
/* 581 */               z7 = true;
                    } else {
/* 214 */               List<i01Oil0> workSpecIdAndStatesForName = workDatabase.I001lIiIIo1O().getWorkSpecIdAndStatesForName(str2);
/* 222 */               if (!workSpecIdAndStatesForName.isEmpty()) {
/* 226 */                   if (il1OO1ilo0o1 == Il1OO1ilo0o1.I00iiO || il1OO1ilo0o1 == Il1OO1ilo0o1.I00iio) {
/* 314 */                       DependencyDao dependencyDaoI001IIilI0O = workDatabase.I001IIilI0O();
/* 320 */                       ArrayList arrayList = new ArrayList();
/* 331 */                       for (i01Oil0 i01oil0 : workSpecIdAndStatesForName) {
/* 345 */                           if (dependencyDaoI001IIilI0O.hasDependents(i01oil0.I00000oIO)) {
/* 381 */                               z8 = zIsEmpty;
                                    } else {
/* 347 */                               i01IOiO1lO i01ioio1lo2 = i01oil0.I00000oOI;
/* 356 */                               boolean z10 = z & (i01ioio1lo2 == i01IOiO1lO.I00iiO);
/* 358 */                               z8 = zIsEmpty;
/* 362 */                               if (i01ioio1lo2 == i01IOiO1lO.I00iio) {
/* 364 */                                   z3 = true;
                                        } else if (i01ioio1lo2 == i01IOiO1lO.I00ilO0) {
/* 371 */                                   z2 = true;
                                        }
/* 375 */                               arrayList.add(i01oil0.I00000oIO);
/* 378 */                               z = z10;
                                    }
/* 383 */                           zIsEmpty = z8;
                                }
/* 387 */                       z4 = zIsEmpty;
                                ArrayList arrayList2 = arrayList;
                                arrayList2 = arrayList;
/* 391 */                       if (il1OO1ilo0o1 == Il1OO1ilo0o1.I00iio && (z2 || z3)) {
/* 397 */                           WorkSpecDao workSpecDaoI001lIiIIo1O = workDatabase.I001lIiIIo1O();
/* 405 */                           Iterator<i01Oil0> it = workSpecDaoI001lIiIIo1O.getWorkSpecIdAndStatesForName(str2).iterator();
/* 413 */                           while (it.hasNext()) {
/* 423 */                               workSpecDaoI001lIiIIo1O.delete(it.next().I00000oIO);
                                    }
/* 429 */                           z2 = false;
/* 431 */                           z3 = false;
/* 427 */                           arrayList2 = Collections.EMPTY_LIST;
                                }
/* 437 */                       strArr = (String[]) arrayList2.toArray(strArr);
/* 444 */                       z9 = strArr.length > 0;
                            } else {
/* 236 */                       if (il1OO1ilo0o1 == Il1OO1ilo0o1.I00iiI) {
/* 238 */                           Iterator<i01Oil0> it2 = workSpecIdAndStatesForName.iterator();
/* 246 */                           while (it2.hasNext()) {
/* 254 */                               i01IOiO1lO i01ioio1lo3 = it2.next().I00000oOI;
/* 258 */                               if (i01ioio1lo3 == i01IOiO1lO.I00iOIl || i01ioio1lo3 == i01IOiO1lO.I00iiI) {
/* 164 */                                   z7 = true;
/* 165 */                                   z6 = false;
                                        }
                                    }
                                }
/* 268 */                       IIoOlOliI1 iIoOlOliI1 = new IIoOlOliI1(0);
/* 271 */                       iIoOlOliI1.I00iiI = workDatabase;
/* 273 */                       iIoOlOliI1.I00iiO = str2;
/* 275 */                       iIoOlOliI1.I00iio = i01iloo;
/* 277 */                       VarHandle.storeStoreFence();
/* 280 */                       workDatabase.I0010I0i(iIoOlOliI1);
/* 283 */                       WorkSpecDao workSpecDaoI001lIiIIo1O2 = workDatabase.I001lIiIIo1O();
/* 287 */                       Iterator<i01Oil0> it3 = workSpecIdAndStatesForName.iterator();
/* 295 */                       while (it3.hasNext()) {
/* 305 */                           workSpecDaoI001lIiIIo1O2.delete(it3.next().I00000oIO);
                                }
/* 309 */                       z4 = zIsEmpty;
/* 311 */                       z5 = true;
/* 458 */                       while (r3.hasNext()) {
                                }
/* 580 */                       z6 = z5;
/* 581 */                       z7 = true;
                            }
                        }
/* 445 */               z5 = false;
/* 458 */               while (r3.hasNext()) {
                        }
/* 580 */               z6 = z5;
/* 581 */               z7 = true;
                    }
/* 582 */           i01i0iooi10.I000O01llI0 = z7;
/* 584 */           return zI00000oOI | z6;
                }
            }
