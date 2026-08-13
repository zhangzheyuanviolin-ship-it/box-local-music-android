            package p000;

            import android.content.ComponentName;
            import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
            import androidx.work.multiprocess.RemoteListenableWorker;
            import java.lang.invoke.VarHandle;
            
            public final class Oi000I extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final RemoteListenableDelegatingWorker I00iiO;
                public final RemoteListenableDelegatingWorker I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oi000I(RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, IOoil1iiIilo iOoil1iiIilo, RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = remoteListenableDelegatingWorker;
/* 5 */             this.I00iio = remoteListenableDelegatingWorker2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = this.I00iio;
/* 5 */             RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new Oi000I(remoteListenableDelegatingWorker2, iOoil1iiIilo, remoteListenableDelegatingWorker, 0);
                        default:
/* 13 */                    return new Oi000I(remoteListenableDelegatingWorker2, iOoil1iiIilo, remoteListenableDelegatingWorker, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((Oi000I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 7 */             RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = this.I00iio;
/* 15 */            RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 127 */                   O10oOoo101iO o10oOoo101iO = remoteListenableDelegatingWorker2.I0000Il00O;
/* 129 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 131 */                   int i2 = this.I00iiI;
/* 133 */                   if (i2 == 0) {
/* 145 */                       lIoii1l01l0i.I00000oOI(obj);
/* 152 */                       String strI0000Il00O = remoteListenableDelegatingWorker2.getInputData().I0000Il00O("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
/* 160 */                       String strI0000Il00O2 = remoteListenableDelegatingWorker2.getInputData().I0000Il00O(RemoteListenableWorker.ARGUMENT_CLASS_NAME);
/* 164 */                       if (strI0000Il00O == null) {
/* 228 */                           I000II.I000iOII("Need to specify a package name for the Remote Service.");
                                    break;
                                } else if (strI0000Il00O2 == null) {
/* 224 */                           I000II.I000iOII("Need to specify a class name for the Remote Service.");
                                    break;
                                } else {
/* 170 */                           ComponentName componentName = new ComponentName(strI0000Il00O, strI0000Il00O2);
/* 173 */                           remoteListenableDelegatingWorker2.I0000O = componentName;
/* 179 */                           IIOOoll iIOOoll = new IIOOoll(22);
/* 182 */                           iIOOoll.I00iiI = remoteListenableDelegatingWorker;
/* 184 */                           VarHandle.storeStoreFence();
/* 187 */                           Oll0oO oll0oOI00000oIO = o10oOoo101iO.I00000oIO(componentName, iIOOoll);
/* 191 */                           this.I00iiI = 1;
/* 193 */                           obj = i01ilOlII00I.I00000oIO(oll0oOI00000oIO, remoteListenableDelegatingWorker2, this);
/* 197 */                           if (obj == ii0111o) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
/* 141 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 137 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 211 */                   IliliOOliOi ililiOOliOi = ((OIolio1l) l1oOOloO0.I00000oOI((byte[]) obj, OIolio1l.CREATOR)).I00iOIl;
/* 217 */                   IIi0oIl.I000II().getClass();
/* 220 */                   o10oOoo101iO.I00000oOI();
                            break;
                        default:
/* 22 */                    O10oOoo101iO o10oOoo101iO2 = remoteListenableDelegatingWorker2.I0000Il00O;
/* 24 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 26 */                    int i3 = this.I00iiI;
/* 28 */                    if (i3 == 0) {
/* 40 */                        lIoii1l01l0i.I00000oOI(obj);
/* 47 */                        String strI0000Il00O3 = remoteListenableDelegatingWorker2.getInputData().I0000Il00O("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
/* 55 */                        String strI0000Il00O4 = remoteListenableDelegatingWorker2.getInputData().I0000Il00O(RemoteListenableWorker.ARGUMENT_CLASS_NAME);
/* 59 */                        if (strI0000Il00O3 == null) {
/* 123 */                           I000II.I000iOII("Need to specify a package name for the Remote Service.");
                                    break;
                                } else if (strI0000Il00O4 == null) {
/* 119 */                           I000II.I000iOII("Need to specify a class name for the Remote Service.");
                                    break;
                                } else {
/* 65 */                            ComponentName componentName2 = new ComponentName(strI0000Il00O3, strI0000Il00O4);
/* 68 */                            remoteListenableDelegatingWorker2.I0000O = componentName2;
/* 74 */                            O1OIll00i o1OIll00i = new O1OIll00i(21);
/* 77 */                            o1OIll00i.I00iiI = remoteListenableDelegatingWorker;
/* 79 */                            VarHandle.storeStoreFence();
/* 82 */                            Oll0oO oll0oOI00000oIO2 = o10oOoo101iO2.I00000oIO(componentName2, o1OIll00i);
/* 86 */                            this.I00iiI = 1;
/* 88 */                            obj = i01ilOlII00I.I00000oIO(oll0oOI00000oIO2, remoteListenableDelegatingWorker2, this);
/* 92 */                            if (obj == ii0111o2) {
                                        break;
                                    }
                                }
                            } else if (i3 != 1) {
/* 36 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 32 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 106 */                   O10oI0l1 o10oI0l1 = ((OIoo1iiOO1II) l1oOOloO0.I00000oOI((byte[]) obj, OIoo1iiOO1II.CREATOR)).I00iOIl;
/* 112 */                   IIi0oIl.I000II().getClass();
/* 115 */                   o10oOoo101iO2.I00000oOI();
                            break;
                    }
/* 18 */            return null;
                }
            }
