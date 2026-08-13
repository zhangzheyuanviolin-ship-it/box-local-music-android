            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.FutureTask;
            
/* 44 */    public final class l0loIioo1Il extends FutureTask implements Comparable {
                public final long I00iOIl;
                public final boolean I00iiI;
                public final String I00iiO;
                public final l0o10OoO0 I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l0loIioo1Il(l0o10OoO0 l0o10ooo0, Callable callable, boolean z) {
/* 3 */             super(callable);
/* 1 */             this.I00iio = l0o10ooo0;
/* 8 */             long andIncrement = l0o10OoO0.I00li1OI.getAndIncrement();
/* 12 */            this.I00iOIl = andIncrement;
/* 16 */            this.I00iiO = "Task exception on worker thread";
/* 18 */            this.I00iiI = z;
/* 27 */            if (andIncrement == Long.MAX_VALUE) {
/* 33 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) l0o10ooo0.I00iOIl).I00ilO0;
/* 35 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 42 */                l01o0io1ooo0.I00ilO0.I00000oOI("Tasks index overflow");
                    }
                }

                @Override
                public final int compareTo(Object obj) {
/* 1 */             l0loIioo1Il l0loiioo1il = (l0loIioo1Il) obj;
/* 3 */             boolean z = l0loiioo1il.I00iiI;
/* 5 */             boolean z2 = this.I00iiI;
/* 7 */             if (z2 != z) {
                        return !z2 ? 1 : -1;
                    }
/* 12 */            long j = l0loiioo1il.I00iOIl;
/* 14 */            long j2 = this.I00iOIl;
/* 18 */            if (j2 < j) {
/* 20 */                return -1;
                    }
/* 22 */            if (j2 > j) {
/* 24 */                return 1;
                    }
/* 32 */            l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iio.I00iOIl).I00ilO0;
/* 34 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 45 */            l01o0io1ooo0.I00io1l.I0000Il00O("Two tasks share the same index. index", Long.valueOf(j2));
/* 48 */            return 0;
                }

                @Override
                public final void setException(Throwable th) {
/* 7 */             l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iio.I00iOIl).I00ilO0;
/* 9 */             l0olllO1i.I000II(l01o0io1ooo0);
/* 16 */            l01o0io1ooo0.I00ilO0.I0000Il00O(this.I00iiO, th);
/* 19 */            super.setException(th);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 45 */        public l0loIioo1Il(l0o10OoO0 l0o10ooo0, Runnable runnable, boolean z, String str) {
/* 47 */            super(runnable, null);
/* 46 */            this.I00iio = l0o10ooo0;
/* 49 */            long andIncrement = l0o10OoO0.I00li1OI.getAndIncrement();
                    this.I00iOIl = andIncrement;
                    this.I00iiO = str;
                    this.I00iiI = z;
                    if (andIncrement == Long.MAX_VALUE) {
/* 50 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) l0o10ooo0.I00iOIl).I00ilO0;
/* 51 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 53 */                l01o0io1ooo0.I00ilO0.I00000oOI("Tasks index overflow");
                    }
                }
            }
