            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            
            public final class O0oOooi1l {
                public Object I00000oIO;
                public HashMap I00000oOI;
                public HashMap I0000Il00O;
                public ArrayDeque I0000O;
                public IIlOO01iI I0000oI00;

                /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:10:0x0024, B:12:0x0030, B:13:0x0032, B:15:0x0035, B:38:0x0078, B:39:0x007b, B:41:0x008b, B:42:0x008e, B:45:0x0091, B:46:0x0096, B:20:0x003b, B:21:0x003c, B:22:0x003d, B:23:0x0041, B:25:0x0047, B:27:0x005e, B:30:0x0069, B:31:0x006b, B:33:0x006d, B:34:0x0074, B:37:0x0077, B:32:0x006c, B:14:0x0033), top: B:49:0x0003, inners: #1, #2, #3 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(O0oOi0i1O o0oOi0i1O, IOiOol0 iOiOol0, IIlOO01iI iIlOO01iI) {
                    O0oiOi o0oiOiI000OiO;
                    O0oOo1O o0oOo1OI0000Il00O;
                    Iterator it;
                    int i;
                    synchronized (this.I00000oIO) {
                        try {
/* 14 */                    lII1OI11o1I.I00000oOI(!((List) iOiOol0.I00ilO0).isEmpty());
/* 17 */                    this.I0000oI00 = iIlOO01iI;
/* 19 */                    o0oiOiI000OiO = o0oOi0i1O.I000OiO();
/* 23 */                    I0000oI00(o0oiOiI000OiO);
/* 26 */                    o0oOo1OI0000Il00O = I0000Il00O(o0oiOiI000OiO);
                        } catch (Throwable th) {
/* 408 */                   throw th;
                        }
/* 30 */                if (o0oOo1OI0000Il00O == null) {
/* 33 */                    return;
                        }
/* 43 */                Set set = (Set) this.I0000Il00O.get(o0oOo1OI0000Il00O);
/* 45 */                IIlOO01iI iIlOO01iI2 = this.I0000oI00;
/* 47 */                if (iIlOO01iI2 == null) {
/* 62 */                    it = set.iterator();
                            while (true) {
/* 70 */                        if (!it.hasNext()) {
                                    break;
                                }
/* 408 */                       throw th;
                            }
                        }
                        synchronized (iIlOO01iI2.I00000oOI) {
/* 52 */                    i = iIlOO01iI2.I0001Ioi1lo;
                        }
/* 56 */                if (i != 2) {
/* 62 */                    it = set.iterator();
                            while (true) {
/* 70 */                        if (!it.hasNext()) {
/* 84 */                            O0oOi0i1O o0oOi0i1O2 = (O0oOi0i1O) this.I00000oOI.get((I1l100l) it.next());
/* 86 */                            o0oOi0i1O2.getClass();
/* 93 */                            if (!o0oOi0i1O2.equals(o0oOi0i1O) && !o0oOi0i1O2.I00111O().isEmpty()) {
                                        synchronized (o0oOi0i1O2.I00iOIl) {
                                        }
/* 117 */                               throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                                    }
                                }
/* 408 */                       throw th;
                            }
                        }
                        try {
/* 121 */                   o0oOi0i1O.I0000oI00(iOiOol0);
/* 138 */                   if (o0oiOiI000OiO.I000iOII().I00ol1().I00000oIO(O0oOi0I.I00iio)) {
/* 140 */                       I000II(o0oiOiI000OiO);
                            }
                        } catch (IIoIIOI0l1 e) {
/* 151 */                   throw new IllegalArgumentException(e);
                        }
                    }
                }

                public final O0oOi0i1O I00000oOI(O0oiOi o0oiOi, IIoIi00lIii0 iIoIi00lIii0, OiI0OoOIi oiI0OoOIi) {
                    synchronized (this.I00000oIO) {
                        try {
/* 23 */                    lII1OI11o1I.I00000oIO("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.I00000oOI.get(I1l100l.I00000oIO(o0oiOi, iIoIi00lIii0.I00iio)) == null);
/* 28 */                    O0oOi0i1O o0oOi0i1O = new O0oOi0i1O(o0oiOi, iIoIi00lIii0, oiI0OoOIi);
/* 41 */                    if (((ArrayList) iIoIi00lIii0.I001lIiIIo1O()).isEmpty()) {
/* 43 */                        o0oOi0i1O.I001IIilI0O();
                            }
/* 59 */                    if (o0oiOi.I000iOII().I00ol1() == O0oOi0I.I00iOIl) {
/* 62 */                        return o0oOi0i1O;
                            }
/* 63 */                    I0001Ioi1lo(o0oOi0i1O);
/* 67 */                    return o0oOi0i1O;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                public final O0oOo1O I0000Il00O(O0oiOi o0oiOi) {
                    synchronized (this.I00000oIO) {
                        try {
/* 18 */                    for (O0oOo1O o0oOo1O : this.I0000Il00O.keySet()) {
/* 32 */                        if (o0oiOi.equals(o0oOo1O.I00iiI)) {
/* 35 */                            return o0oOo1O;
                                }
                            }
/* 38 */                    return null;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public final boolean I0000O(O0oiOi o0oiOi) {
                    synchronized (this.I00000oIO) {
                        try {
/* 4 */                     O0oOo1O o0oOo1OI0000Il00O = I0000Il00O(o0oiOi);
/* 9 */                     if (o0oOo1OI0000Il00O == null) {
/* 8 */                         return false;
                            }
/* 23 */                    Iterator it = ((Set) this.I0000Il00O.get(o0oOo1OI0000Il00O)).iterator();
/* 31 */                    while (it.hasNext()) {
/* 45 */                        O0oOi0i1O o0oOi0i1O = (O0oOi0i1O) this.I00000oOI.get((I1l100l) it.next());
/* 47 */                        o0oOi0i1O.getClass();
/* 58 */                        if (!o0oOi0i1O.I00111O().isEmpty()) {
/* 60 */                            return true;
                                }
                            }
/* 8 */                     return false;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public final void I0000oI00(O0oiOi o0oiOi) {
                    I0Iiil0 i0Iiil0;
/* 1 */             HashMap map = this.I00000oOI;
/* 3 */             O0oOo1O o0oOo1OI0000Il00O = I0000Il00O(o0oiOi);
/* 7 */             if (o0oOo1OI0000Il00O == null) {
/* 168 */               return;
                    }
/* 13 */            HashSet hashSet = new HashSet();
/* 22 */            Set<I1l100l> set = (Set) this.I0000Il00O.get(o0oOo1OI0000Il00O);
/* 24 */            Objects.requireNonNull(set);
/* 37 */            for (I1l100l i1l100l : set) {
/* 49 */                O0oOi0i1O o0oOi0i1O = (O0oOi0i1O) map.get(i1l100l);
/* 51 */                if (o0oOi0i1O != null) {
/* 53 */                    IIoIi00lIii0 iIoIi00lIii0 = o0oOi0i1O.I00iiO;
/* 63 */                    if (iIoIi00lIii0.I00iOIl.I00iOIl.I000lI() || ((i0Iiil0 = iIoIi00lIii0.I00iiI) != null && i0Iiil0.I00iOIl.I000lI())) {
/* 77 */                        hashSet.add(i1l100l);
                            }
                        }
                    }
/* 85 */            if (hashSet.isEmpty()) {
/* 168 */               return;
                    }
/* 112 */           l11I11lO.I0000oI00("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
/* 115 */           Iterator it = hashSet.iterator();
/* 123 */           while (it.hasNext()) {
/* 135 */               O0oOi0i1O o0oOi0i1O2 = (O0oOi0i1O) map.get((I1l100l) it.next());
/* 137 */               Objects.requireNonNull(o0oOi0i1O2);
/* 140 */               I000iOII(o0oOi0i1O2);
                    }
                }

                public final void I0001Ioi1lo(O0oOi0i1O o0oOi0i1O) {
                    synchronized (this.I00000oIO) {
                        try {
/* 4 */                     O0oiOi o0oiOiI000OiO = o0oOi0i1O.I000OiO();
/* 12 */                    I1l100l i1l100lI00000oIO = I1l100l.I00000oIO(o0oiOiI000OiO, o0oOi0i1O.I00iiO.I00iio);
/* 16 */                    O0oOo1O o0oOo1OI0000Il00O = I0000Il00O(o0oiOiI000OiO);
/* 35 */                    Set hashSet = o0oOo1OI0000Il00O != null ? (Set) this.I0000Il00O.get(o0oOo1OI0000Il00O) : new HashSet();
/* 38 */                    hashSet.add(i1l100lI00000oIO);
/* 43 */                    this.I00000oOI.put(i1l100lI00000oIO, o0oOi0i1O);
/* 46 */                    if (o0oOo1OI0000Il00O == null) {
/* 50 */                        O0oOo1O o0oOo1O = new O0oOo1O();
/* 53 */                        o0oOo1O.I00iiI = o0oiOiI000OiO;
/* 55 */                        o0oOo1O.I00iOIl = this;
/* 57 */                        VarHandle.storeStoreFence();
/* 62 */                        this.I0000Il00O.put(o0oOo1O, hashSet);
/* 69 */                        o0oiOiI000OiO.I000iOII().I00li1OI(o0oOo1O);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x003a A[Catch: all -> 0x000b, TryCatch #1 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000d, B:12:0x0015, B:28:0x0047, B:29:0x004a, B:13:0x001b, B:15:0x001f, B:16:0x0021, B:18:0x0024, B:23:0x002a, B:24:0x002b, B:25:0x002c, B:27:0x003a, B:17:0x0022), top: B:35:0x0003, inners: #0 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(O0oiOi o0oiOi) {
                    O0oiOi o0oiOi2;
                    int i;
                    synchronized (this.I00000oIO) {
                        try {
/* 8 */                     if (I0000O(o0oiOi)) {
/* 20 */                        if (this.I0000O.isEmpty()) {
/* 24 */                            this.I0000O.push(o0oiOi);
                                } else {
/* 28 */                            IIlOO01iI iIlOO01iI = this.I0000oI00;
/* 30 */                            if (iIlOO01iI != null) {
                                        synchronized (iIlOO01iI.I00000oOI) {
/* 35 */                                    i = iIlOO01iI.I0001Ioi1lo;
                                        }
/* 39 */                                if (i != 2) {
/* 51 */                                    o0oiOi2 = (O0oiOi) this.I0000O.peek();
/* 57 */                                    if (!o0oiOi.equals(o0oiOi2)) {
/* 59 */                                        I000OOo1O(o0oiOi2);
/* 64 */                                        this.I0000O.remove(o0oiOi);
/* 69 */                                        this.I0000O.push(o0oiOi);
                                            }
                                        }
                                    } else {
/* 51 */                                o0oiOi2 = (O0oiOi) this.I0000O.peek();
/* 57 */                                if (!o0oiOi.equals(o0oiOi2)) {
                                        }
                                    }
                                }
/* 72 */                        I000lI(o0oiOi);
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                public final void I000O01llI0(O0oiOi o0oiOi) {
                    synchronized (this.I00000oIO) {
                        try {
/* 6 */                     this.I0000O.remove(o0oiOi);
/* 9 */                     I000OOo1O(o0oiOi);
/* 18 */                    if (!this.I0000O.isEmpty()) {
/* 28 */                        I000lI((O0oiOi) this.I0000O.peek());
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public final void I000OOo1O(O0oiOi o0oiOi) {
                    synchronized (this.I00000oIO) {
                        try {
/* 4 */                     O0oOo1O o0oOo1OI0000Il00O = I0000Il00O(o0oiOi);
/* 8 */                     if (o0oOo1OI0000Il00O == null) {
/* 11 */                        return;
                            }
/* 22 */                    Iterator it = ((Set) this.I0000Il00O.get(o0oOo1OI0000Il00O)).iterator();
/* 30 */                    while (it.hasNext()) {
/* 44 */                        O0oOi0i1O o0oOi0i1O = (O0oOi0i1O) this.I00000oOI.get((I1l100l) it.next());
/* 46 */                        o0oOi0i1O.getClass();
/* 49 */                        o0oOi0i1O.I001IIilI0O();
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
                public final void I000OiO(HashSet hashSet) {
                    HashSet hashSetKeySet = hashSet;
                    synchronized (this.I00000oIO) {
/* 4 */                 if (hashSet == null) {
                            try {
/* 8 */                         hashSetKeySet = this.I00000oOI.keySet();
                            } catch (Throwable th) {
/* 77 */                        throw th;
                            }
                        }
/* 15 */                Iterator it = hashSetKeySet.iterator();
/* 23 */                while (it.hasNext()) {
/* 37 */                    O0oOi0i1O o0oOi0i1O = (O0oOi0i1O) this.I00000oOI.get((I1l100l) it.next());
/* 39 */                    if (o0oOi0i1O != null) {
/* 41 */                        o0oOi0i1O.I001IO000();
/* 48 */                        I000O01llI0(o0oOi0i1O.I000OiO());
                            }
                        }
                    }
                }

                public final void I000iOII(O0oOi0i1O o0oOi0i1O) {
                    synchronized (this.I00000oIO) {
                        try {
/* 4 */                     O0oiOi o0oiOiI000OiO = o0oOi0i1O.I000OiO();
/* 12 */                    I1l100l i1l100lI00000oIO = I1l100l.I00000oIO(o0oiOiI000OiO, o0oOi0i1O.I00iiO.I00iio);
/* 18 */                    this.I00000oOI.remove(i1l100lI00000oIO);
/* 23 */                    HashSet hashSet = new HashSet();
/* 40 */                    for (O0oOo1O o0oOo1O : this.I0000Il00O.keySet()) {
/* 54 */                        if (o0oiOiI000OiO.equals(o0oOo1O.I00iiI)) {
/* 62 */                            Set set = (Set) this.I0000Il00O.get(o0oOo1O);
/* 64 */                            set.remove(i1l100lI00000oIO);
/* 71 */                            if (set.isEmpty()) {
/* 75 */                                hashSet.add(o0oOo1O.I00iiI);
                                    }
                                }
                            }
/* 81 */                    Iterator it = hashSet.iterator();
/* 89 */                    while (it.hasNext()) {
/* 97 */                        I000l1((O0oiOi) it.next());
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                public final void I000l1(O0oiOi o0oiOi) {
                    synchronized (this.I00000oIO) {
                        try {
/* 4 */                     O0oOo1O o0oOo1OI0000Il00O = I0000Il00O(o0oiOi);
/* 8 */                     if (o0oOo1OI0000Il00O == null) {
/* 11 */                        return;
                            }
/* 14 */                    I000O01llI0(o0oiOi);
/* 25 */                    Iterator it = ((Set) this.I0000Il00O.get(o0oOo1OI0000Il00O)).iterator();
/* 33 */                    while (it.hasNext()) {
/* 43 */                        this.I00000oOI.remove((I1l100l) it.next());
                            }
/* 49 */                    this.I0000Il00O.remove(o0oOo1OI0000Il00O);
/* 58 */                    o0oOo1OI0000Il00O.I00iiI.I000iOII().I00ooIo0(o0oOo1OI0000Il00O);
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public final void I000lI(O0oiOi o0oiOi) {
                    synchronized (this.I00000oIO) {
                        try {
/* 16 */                    Iterator it = ((Set) this.I0000Il00O.get(I0000Il00O(o0oiOi))).iterator();
/* 24 */                    while (it.hasNext()) {
/* 38 */                        O0oOi0i1O o0oOi0i1O = (O0oOi0i1O) this.I00000oOI.get((I1l100l) it.next());
/* 40 */                        o0oOi0i1O.getClass();
/* 51 */                        if (!o0oOi0i1O.I00111O().isEmpty()) {
/* 53 */                            o0oOi0i1O.I001i1O0Ol();
                                }
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }
