            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.util.Log;
            import androidx.work.impl.model.DependencyDao;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import java.util.ArrayDeque;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            
            public final class IlII1oo implements Callable {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public IlII1oo(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() {
                    ServiceInfo serviceInfo;
                    String str;
                    int i;
/* 3 */             String str2 = null;
/* 4 */             boolean z = false;
                    switch (this.I00000oIO) {
                        case 0:
/* 413 */                   Context context = (Context) this.I00000oOI;
/* 417 */                   Intent intent = (Intent) this.I0000Il00O;
/* 419 */                   OillOo0 oillOo0I000iOII = OillOo0.I000iOII();
/* 426 */                   Log.isLoggable("FirebaseMessaging", 3);
/* 433 */                   ((ArrayDeque) oillOo0I000iOII.I00ilI0I1).offer(intent);
/* 440 */                   Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
/* 447 */                   intent2.setPackage(context.getPackageName());
                            synchronized (oillOo0I000iOII) {
                                try {
/* 455 */                           String str3 = (String) oillOo0I000iOII.I00iiI;
/* 457 */                           if (str3 != null) {
/* 460 */                               str2 = str3;
                                    } else {
/* 467 */                               ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
/* 471 */                               if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
/* 571 */                                   Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                                        } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
/* 562 */                                   Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                        } else if (str.startsWith(".")) {
/* 520 */                                   str2 = context.getPackageName() + serviceInfo.name;
/* 524 */                                   oillOo0I000iOII.I00iiI = str2;
                                        } else {
/* 530 */                                   str2 = serviceInfo.name;
/* 532 */                                   oillOo0I000iOII.I00iiI = str2;
                                        }
                                    }
                                } finally {
                                }
                            }
/* 575 */                   if (str2 != null) {
/* 579 */                       Log.isLoggable("FirebaseMessaging", 3);
/* 586 */                       intent2.setClassName(context.getPackageName(), str2);
                            }
                            try {
/* 604 */                       if ((oillOo0I000iOII.I000o00OoI0I(context) ? iO1O101oi.I0000Il00O(context, intent2) : context.startService(intent2)) == null) {
/* 610 */                           Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
/* 613 */                           i = 404;
                                } else {
/* 616 */                           i = -1;
                                }
                            } catch (IllegalStateException e) {
/* 635 */                       Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
/* 638 */                       i = 402;
                            } catch (SecurityException e2) {
/* 646 */                       Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
/* 649 */                       i = 401;
                            }
/* 651 */                   return Integer.valueOf(i);
                        default:
/* 10 */                    i01iiO i01iio = (i01iiO) this.I00000oOI;
/* 14 */                    i01ilO i01ilo = (i01ilO) this.I0000Il00O;
/* 16 */                    String str4 = i01ilo.I000lI;
/* 18 */                    String str5 = i01ilo.I0000Il00O;
/* 20 */                    WorkSpecDao workSpecDao = i01ilo.I000OiO;
/* 22 */                    WorkSpec workSpec = i01ilo.I00000oIO;
/* 29 */                    if (i01iio instanceof i01ii0lIOo10) {
/* 33 */                        O10oI0l1 o10o0OiIIll = ((i01ii0lIOo10) i01iio).I00000oIO;
/* 35 */                        i01IOiO1lO state = workSpecDao.getState(str5);
/* 45 */                        i01ilo.I000OOo1O.I001l0I00().delete(str5);
/* 48 */                        if (state != null) {
/* 54 */                            if (state == i01IOiO1lO.I00iiI) {
/* 58 */                                if (o10o0OiIIll instanceof O10o0oOio1) {
/* 60 */                                    String str6 = i01ilOlII00I.I00000oIO;
/* 80 */                                    IIi0oIl.I000II().I000OOo1O(str6, "Worker result SUCCESS for " + str4);
/* 87 */                                    if (workSpec.isPeriodic()) {
/* 89 */                                        i01ilo.I00000oOI();
                                            } else {
/* 96 */                                        workSpecDao.setState(i01IOiO1lO.I00iiO, str5);
/* 103 */                                       workSpecDao.setOutput(str5, ((O10o0oOio1) o10o0OiIIll).I00000oIO);
/* 108 */                                       i01ilo.I000II.getClass();
/* 111 */                                       long jCurrentTimeMillis = System.currentTimeMillis();
/* 115 */                                       DependencyDao dependencyDao = i01ilo.I000iOII;
/* 129 */                                       for (String str7 : dependencyDao.getDependentWorkIds(str5)) {
/* 143 */                                           if (workSpecDao.getState(str7) == i01IOiO1lO.I00ilI0I1 && dependencyDao.hasCompletedAllPrerequisites(str7)) {
/* 151 */                                               String str8 = i01ilOlII00I.I00000oIO;
/* 171 */                                               IIi0oIl.I000II().I000OOo1O(str8, "Setting status to enqueued for " + str7);
/* 176 */                                               workSpecDao.setState(i01IOiO1lO.I00iOIl, str7);
/* 179 */                                               workSpecDao.setLastEnqueueTime(str7, jCurrentTimeMillis);
                                                    }
                                                }
                                            }
                                        } else if (o10o0OiIIll instanceof O10o0o00) {
/* 187 */                                   String str9 = i01ilOlII00I.I00000oIO;
/* 207 */                                   IIi0oIl.I000II().I000OOo1O(str9, "Worker result RETRY for " + str4);
/* 212 */                                   i01ilo.I00000oIO(-256);
/* 215 */                                   z = true;
                                        } else {
/* 218 */                                   String str10 = i01ilOlII00I.I00000oIO;
/* 236 */                                   IIi0oIl.I000II().I000OOo1O(str10, "Worker result FAILURE for " + str4);
/* 243 */                                   if (workSpec.isPeriodic()) {
/* 245 */                                       i01ilo.I00000oOI();
                                            } else {
/* 250 */                                       if (o10o0OiIIll == null) {
/* 254 */                                           o10o0OiIIll = new O10o0OiIIll();
                                                }
/* 257 */                                       i01ilo.I0000O(o10o0OiIIll);
                                            }
                                        }
                                    } else if (!state.I00000oIO()) {
/* 270 */                               i01ilo.I00000oIO(-512);
/* 215 */                               z = true;
                                    }
                                }
                            } else if (i01iio instanceof i01iOoio) {
/* 280 */                       O10oI0l1 o10oI0l1 = ((i01iOoio) i01iio).I00000oIO;
/* 282 */                       String str11 = i01ilOlII00I.I00000oIO;
/* 300 */                       IIi0oIl.I000II().I000OOo1O(str11, "Worker result FAILURE for " + str4);
/* 307 */                       if (workSpec.isPeriodic()) {
/* 309 */                           i01ilo.I00000oOI();
                                } else {
/* 313 */                           i01ilo.I0000O(o10oI0l1);
                                }
                            } else {
/* 319 */                       if (!(i01iio instanceof i01iiI111lo)) {
/* 407 */                           I000II.I00000oIO();
/* 3 */                             return null;
                                }
/* 323 */                       int i2 = ((i01iiI111lo) i01iio).I00000oIO;
/* 335 */                       if (O0000Ioio00.I0000O(workSpec.getBackOffOnSystemInterruptions(), Boolean.TRUE)) {
/* 337 */                           String str12 = i01ilOlII00I.I00000oIO;
/* 343 */                           IIi0oIl.I000II().getClass();
/* 346 */                           i01ilo.I00000oIO(i2);
                                } else {
/* 351 */                           i01IOiO1lO state2 = workSpecDao.getState(str5);
/* 355 */                           if (state2 == null || state2.I00000oIO()) {
/* 390 */                               String str13 = i01ilOlII00I.I00000oIO;
/* 392 */                               IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 396 */                               Objects.toString(state2);
/* 399 */                               iIi0oIlI000II.getClass();
                                    } else {
/* 363 */                               String str14 = i01ilOlII00I.I00000oIO;
/* 365 */                               IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 369 */                               state2.toString();
/* 372 */                               iIi0oIlI000II2.getClass();
/* 377 */                               workSpecDao.setState(i01IOiO1lO.I00iOIl, str5);
/* 380 */                               workSpecDao.setStopReason(str5, i2);
/* 385 */                               workSpecDao.markWorkSpecScheduled(str5, -1L);
                                    }
                                }
/* 215 */                       z = true;
                            }
/* 402 */                   return Boolean.valueOf(z);
                    }
                }
            }
