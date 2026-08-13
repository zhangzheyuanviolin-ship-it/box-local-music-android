            package p000;

            import java.lang.invoke.VarHandle;
            
/* 47 */    public class O1I01I0o implements IllOOo00lI {
                public final O1I0OloI I00iOIl;
                public final IllOOo00lI I00iiI;
                public volatile Object I00iiO;

                public O1I01I0o(O1I0OloI o1I0OloI, IllOOo00lI illOOo00lI) {
/* 1 */             if (o1I0OloI == null) {
/* 16 */                I00000oIO(0);
/* 89 */                throw null;
                    }
/* 8 */             this.I00iiO = O1I0IoIO0li.I00iOIl;
/* 10 */            this.I00iOIl = o1I0OloI;
/* 12 */            this.I00iiI = illOOo00lI;
                }

                public static void I00000oIO(int i) {
/* 10 */            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 19 */            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
/* 25 */            if (i == 1) {
/* 41 */                objArr[0] = "computable";
                    } else if (i == 2 || i == 3) {
/* 36 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                    } else {
/* 33 */                objArr[0] = "storageManager";
                    }
/* 43 */            if (i == 2) {
/* 57 */                objArr[1] = "recursionDetected";
                    } else if (i != 3) {
/* 47 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                    } else {
/* 52 */                objArr[1] = "renderDebugInformation";
                    }
/* 59 */            if (i != 2 && i != 3) {
/* 65 */                objArr[2] = "<init>";
                    }
/* 67 */            String str2 = String.format(str, objArr);
/* 71 */            if (i != 2 && i != 3) {
/* 186 */               throw new IllegalArgumentException(str2);
                    }
/* 186 */           throw new IllegalStateException(str2);
                }

                public IIOo1i I0000oI00(boolean z) {
/* 6 */             IIOo1i iIOo1iI0000O = this.I00iOIl.I0000O("in a lazy value", null);
/* 10 */            if (iIOo1iI0000O != null) {
/* 12 */                return iIOo1iI0000O;
                    }
/* 14 */            I00000oIO(2);
/* 49 */            throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x0072, B:35:0x0079, B:36:0x007a, B:37:0x0080, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object invoke() throws Throwable {
                    Object objInvoke;
/* 1 */             O1I0IoIO0li o1I0IoIO0li = O1I0IoIO0li.I00iiO;
/* 3 */             O1I0IoIO0li o1I0IoIO0li2 = O1I0IoIO0li.I00iiI;
/* 5 */             Object obj = this.I00iiO;
/* 9 */             if (!(obj instanceof O1I0IoIO0li)) {
/* 11 */                i01l0l.I00000oIO(obj);
/* 14 */                return obj;
                    }
/* 19 */            this.I00iOIl.I00000oIO.lock();
                    try {
/* 22 */                Object obj2 = this.I00iiO;
/* 26 */                if (!(obj2 instanceof O1I0IoIO0li)) {
/* 28 */                    i01l0l.I00000oIO(obj2);
/* 38 */                    return obj2;
                        }
/* 41 */                if (obj2 == o1I0IoIO0li2) {
/* 43 */                    this.I00iiO = o1I0IoIO0li;
/* 46 */                    IIOo1i iIOo1iI0000oI00 = I0000oI00(true);
/* 52 */                    if (!iIOo1iI0000oI00.I00000oOI) {
/* 54 */                        objInvoke = iIOo1iI0000oI00.I0000Il00O;
                            } else if (obj2 == o1I0IoIO0li) {
/* 67 */                        IIOo1i iIOo1iI0000oI002 = I0000oI00(false);
/* 73 */                        if (iIOo1iI0000oI002.I00000oOI) {
/* 78 */                            this.I00iiO = o1I0IoIO0li2;
                                    try {
/* 82 */                                objInvoke = this.I00iiI.invoke();
/* 86 */                                I0000O(objInvoke);
/* 89 */                                this.I00iiO = objInvoke;
                                    } catch (Throwable th) {
/* 97 */                                if (ilIiIlIII0.I00000oIO(th)) {
/* 125 */                                   this.I00iiO = O1I0IoIO0li.I00iOIl;
/* 129 */                                   throw th;
                                        }
/* 101 */                               if (this.I00iiO == o1I0IoIO0li2) {
/* 105 */                                   i01l0iOIii i01l0ioiii = new i01l0iOIii();
/* 108 */                                   i01l0ioiii.I00000oIO = th;
/* 110 */                                   VarHandle.storeStoreFence();
/* 113 */                                   this.I00iiO = i01l0ioiii;
                                        }
/* 119 */                               this.I00iOIl.I00000oOI.getClass();
/* 122 */                               throw th;
                                    }
                                } else {
/* 75 */                            objInvoke = iIOo1iI0000oI002.I0000Il00O;
                                }
                            }
                        }
/* 63 */                return objInvoke;
                    } finally {
/* 134 */               this.I00iOIl.I00000oIO.unlock();
                    }
                }

/* 48 */        public void I0000O(Object obj) {
                }
            }
