            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class IIo0IOlilI {
                public Executor I00000oIO;
                public Io11oioo I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public ScheduledFuture I0000oI00;
                public IIlOoolol0ll I0001Ioi1lo;
                public IIo0ii1Oi I000II;
                public OoIlIoo1oiOo I000O01llI0;
                public IIOo1i I000OOo1O;
                public IIo01iOo I000OiO;
                public volatile List I000iOII;
                public AtomicBoolean I000l1;
                public CopyOnWriteArrayList I000lI;
                public CopyOnWriteArrayList I000o00OoI0I;
                public LinkedHashMap I000oI1ioi;

                public final void I00000oIO(String str) {
/* 1 */             IIo0ii1Oi iIo0ii1Oi = this.I000II;
/* 3 */             if (iIo0ii1Oi == null) {
/* 5 */                 return;
                    }
                    try {
/* 14 */                I0000oI00(iIo0ii1Oi.I00000oOI(str).I0010o());
                    } catch (IllegalArgumentException unused) {
/* 39 */                l11I11lO.I0000oI00("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
                    }
                }

                public final void I00000oOI(Set set, Set set2) {
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I000o00OoI0I;
/* 14 */            if (!set.isEmpty()) {
/* 37 */                l11I11lO.I0000Il00O("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
/* 40 */                Iterator it = copyOnWriteArrayList.iterator();
/* 48 */                while (it.hasNext()) {
/* 54 */                    IIo01Oii0 iIo01Oii0 = (IIo01Oii0) it.next();
/* 56 */                    ScheduledExecutorService scheduledExecutorService = iIo01Oii0.I00000oOI;
/* 62 */                    I0100i i0100i = new I0100i(12);
/* 65 */                    i0100i.I00iiI = iIo01Oii0;
/* 67 */                    VarHandle.storeStoreFence();
/* 70 */                    scheduledExecutorService.execute(i0100i);
                        }
                    }
/* 81 */            if (set2.isEmpty()) {
/* 332 */               return;
                    }
/* 104 */           l11I11lO.I0000Il00O("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
/* 107 */           Iterator it2 = copyOnWriteArrayList.iterator();
/* 115 */           while (it2.hasNext()) {
/* 121 */               IIo01Oii0 iIo01Oii02 = (IIo01Oii0) it2.next();
/* 123 */               ScheduledExecutorService scheduledExecutorService2 = iIo01Oii02.I00000oOI;
/* 129 */               I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(8);
/* 132 */               i0iOo0oioiO.I00iiI = iIo01Oii02;
/* 134 */               i0iOo0oioiO.I00iiO = set2;
/* 136 */               VarHandle.storeStoreFence();
/* 139 */               scheduledExecutorService2.execute(i0iOo0oioiO);
                    }
                }

                public final void I0000Il00O(String str) {
                    synchronized (this.I0000Il00O) {
/* 10 */                OIOilII0IlO oIOilII0IlO = (OIOilII0IlO) this.I000oI1ioi.remove(str);
/* 12 */                IIo0ii1Oi iIo0ii1Oi = this.I000II;
/* 14 */                if (oIOilII0IlO != null && iIo0ii1Oi != null) {
                            try {
/* 18 */                        IIllOo0 iIllOo0I00000oOI = iIo0ii1Oi.I00000oOI(str);
/* 22 */                        ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 30 */                        I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(9);
/* 33 */                        i0iOo0oioiO.I00iiI = iIllOo0I00000oOI;
/* 35 */                        i0iOo0oioiO.I00iiO = oIOilII0IlO;
/* 37 */                        VarHandle.storeStoreFence();
/* 42 */                        ((Io11oioo) scheduledExecutorServiceI0000O).execute(i0iOo0oioiO);
/* 48 */                        l11I11lO.I0000O(3, "CameraPresencePrvdr");
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                }

                public final void I0000O(int i, List list) {
/* 1 */             if (i <= 0 || !this.I000l1.get()) {
/* 46 */                if (i <= 0) {
/* 52 */                    l11I11lO.I0000oI00("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
/* 106 */                   return;
                        }
/* 106 */               return;
                    }
/* 18 */            long j = i == 3 ? 0L : 400L;
/* 20 */            Io11oioo io11oioo = this.I00000oOI;
/* 25 */            IIo00o1oi iIo00o1oi = new IIo00o1oi(1);
/* 28 */            iIo00o1oi.I00iiI = this;
/* 30 */            iIo00o1oi.I00iiO = list;
/* 32 */            iIo00o1oi.I00iio = i;
/* 34 */            VarHandle.storeStoreFence();
/* 43 */            this.I0000oI00 = io11oioo.schedule(iIo00o1oi, j, TimeUnit.MILLISECONDS);
                }

                public final void I0000oI00(IIllOioOlolI iIllOioOlolI) {
/* 1 */             String strI0001Ioi1lo = iIllOioOlolI.I0001Ioi1lo();
/* 11 */            if (this.I000l1.get()) {
                        synchronized (this.I0000Il00O) {
/* 23 */                    if (this.I000oI1ioi.containsKey(strI0001Ioi1lo)) {
/* 26 */                        return;
                            }
/* 29 */                    IIo01011I iIo01011I = new IIo01011I();
/* 32 */                    iIo01011I.I00iOIl = this;
/* 34 */                    iIo01011I.I00iiI = strI0001Ioi1lo;
/* 36 */                    VarHandle.storeStoreFence();
/* 39 */                    ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 47 */                    I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(11);
/* 50 */                    i0iOo0oioiO.I00iiI = iIllOioOlolI;
/* 52 */                    i0iOo0oioiO.I00iiO = iIo01011I;
/* 54 */                    VarHandle.storeStoreFence();
/* 59 */                    ((Io11oioo) scheduledExecutorServiceI0000O).execute(i0iOo0oioiO);
/* 64 */                    this.I000oI1ioi.put(strI0001Ioi1lo, iIo01011I);
/* 70 */                    l11I11lO.I0000O(3, "CameraPresencePrvdr");
                        }
                    }
                }

                public final void I0001Ioi1lo() {
/* 9 */             if (!this.I000l1.getAndSet(false)) {
/* 13 */                l11I11lO.I0000O(3, "CameraPresencePrvdr");
/* 16 */                return;
                    }
/* 21 */            l11I11lO.I0000Il00O("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
                    synchronized (this.I0000O) {
                        try {
/* 27 */                    ScheduledFuture scheduledFuture = this.I0000oI00;
/* 29 */                    if (scheduledFuture != null) {
/* 31 */                        scheduledFuture.cancel(false);
                            }
/* 39 */                    this.I0000oI00 = null;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 42 */            OoIlIoo1oiOo ooIlIoo1oiOo = this.I000O01llI0;
/* 44 */            if (ooIlIoo1oiOo != null) {
/* 48 */                ooIlIoo1oiOo.I000OOo1O(this.I000OiO);
                    }
                    synchronized (this.I0000Il00O) {
/* 60 */                if (!this.I000oI1ioi.isEmpty()) {
/* 67 */                    Map mapI000iOII = O1Oii0O0loo.I000iOII(this.I000oI1ioi);
/* 73 */                    this.I000oI1ioi.clear();
/* 77 */                    IIo0ii1Oi iIo0ii1Oi = this.I000II;
/* 79 */                    if (iIo0ii1Oi != null) {
/* 81 */                        LinkedHashSet<IIllOo0> linkedHashSetI0000Il00O = iIo0ii1Oi.I0000Il00O();
/* 87 */                        ArrayList arrayList = new ArrayList();
/* 98 */                        for (IIllOo0 iIllOo0 : linkedHashSetI0000Il00O) {
/* 113 */                           IIllOioOlolI iIllOioOlolII0010o = iIllOo0 != null ? iIllOo0.I0010o() : null;
/* 114 */                           if (iIllOioOlolII0010o != null) {
/* 116 */                               arrayList.add(iIllOioOlolII0010o);
                                    }
                                }
/* 122 */                       mapI000iOII.size();
/* 125 */                       l11I11lO.I0000O(3, "CameraPresencePrvdr");
/* 140 */                       for (Map.Entry entry : mapI000iOII.entrySet()) {
/* 152 */                           String str = (String) entry.getKey();
/* 158 */                           OIOilII0IlO oIOilII0IlO = (OIOilII0IlO) entry.getValue();
/* 160 */                           ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 167 */                           I00ioIO i00ioIO = new I00ioIO(4);
/* 170 */                           i00ioIO.I00iiI = arrayList;
/* 172 */                           i00ioIO.I00iiO = oIOilII0IlO;
/* 174 */                           i00ioIO.I00iio = str;
/* 176 */                           VarHandle.storeStoreFence();
/* 181 */                           ((Io11oioo) scheduledExecutorServiceI0000O).execute(i00ioIO);
                                }
                            }
                        }
                    }
/* 185 */           this.I000OOo1O = null;
/* 189 */           this.I000lI.clear();
/* 194 */           this.I000o00OoI0I.clear();
/* 199 */           this.I000iOII = Il01100l.I00iOIl;
/* 201 */           this.I0001Ioi1lo = null;
/* 203 */           this.I000II = null;
                }

                public final void I000II(IIOo1i iIOo1i, IIlOoolol0ll iIlOoolol0ll, IIo0ii1Oi iIo0ii1Oi) {
/* 9 */             if (this.I000l1.compareAndSet(false, true)) {
/* 16 */                l11I11lO.I0000Il00O("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
/* 19 */                this.I000OOo1O = iIOo1i;
/* 21 */                Set setI000OOo1O = iIlOoolol0ll.I000OOo1O();
/* 35 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(setI000OOo1O, 10));
/* 38 */                Iterator it = setI000OOo1O.iterator();
/* 46 */                while (it.hasNext()) {
/* 59 */                    arrayList.add(iOillilIolO.I00000oIO((String) it.next(), null, null));
                        }
/* 63 */                this.I000iOII = arrayList;
/* 65 */                this.I0001Ioi1lo = iIlOoolol0ll;
/* 67 */                this.I000II = iIo0ii1Oi;
/* 73 */                this.I000O01llI0 = (OoIlIoo1oiOo) iIlOoolol0ll.I00ioIO;
/* 75 */                Executor executor = this.I00000oIO;
/* 79 */                IIo00ilO iIo00ilO = new IIo00ilO(0);
/* 82 */                iIo00ilO.I00iiI = this;
/* 84 */                VarHandle.storeStoreFence();
/* 87 */                executor.execute(iIo00ilO);
/* 90 */                OoIlIoo1oiOo ooIlIoo1oiOo = this.I000O01llI0;
/* 92 */                if (ooIlIoo1oiOo != null) {
/* 102 */                   ooIlIoo1oiOo.I00000oOI(iOioo01l0.I00000oIO(this.I00000oIO), this.I000OiO);
                        }
                    }
                }
            }
