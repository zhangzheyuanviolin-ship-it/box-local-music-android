            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Callable;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            
/* 12 */    public final class IOOoiII1ioO extends Iooo1i1iili {
                public final Executor I00iiO;
                public final IOOoo0o0Io I00iio;
                public final int I00ilI0I1;
                public final IOOoo0o0Io I00ilO0;
                public final Object I00io1l;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public IOOoiII1ioO(IOOoo0o0Io iOOoo0o0Io, Callable callable) {
/* 8 */             this(iOOoo0o0Io, Iii11Ooi.I00iOIl);
/* 2 */             this.I00ilI0I1 = 1;
/* 4 */             this.I00ilO0 = iOOoo0o0Io;
/* 11 */            this.I00io1l = callable;
                }

                @Override
                public final void I00000oIO(Throwable th) {
/* 2 */             IOOoo0o0Io iOOoo0o0Io = this.I00iio;
/* 4 */             iOOoo0o0Io.I00lll10 = null;
/* 8 */             if (th instanceof ExecutionException) {
/* 16 */                iOOoo0o0Io.I000lI(((ExecutionException) th).getCause());
                    } else if (th instanceof CancellationException) {
/* 25 */                iOOoo0o0Io.cancel(false);
                    } else {
/* 29 */                iOOoo0o0Io.I000lI(th);
                    }
                }

                @Override
                public final void I00000oOI(Object obj) {
/* 4 */             this.I00iio.I00lll10 = null;
/* 6 */             int i = this.I00ilI0I1;
/* 8 */             IOOoo0o0Io iOOoo0o0Io = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 19 */                    iOOoo0o0Io.I000o00OoI0I((ListenableFuture) obj);
                            break;
                        default:
/* 13 */                    iOOoo0o0Io.I000l1(obj);
                            break;
                    }
                }

                @Override
                public final boolean I0000O() {
/* 3 */             return this.I00iio.isDone();
                }

                @Override
                public final Object I0000oI00() {
/* 1 */             int i = this.I00ilI0I1;
/* 3 */             Object obj = this.I00io1l;
                    switch (i) {
                        case 0:
/* 17 */                    return ((i000IO) obj).call();
                        default:
/* 10 */                    return ((Callable) obj).call();
                    }
                }

                @Override
                public final String I0001Ioi1lo() {
/* 1 */             int i = this.I00ilI0I1;
/* 3 */             Object obj = this.I00io1l;
                    switch (i) {
                        case 0:
/* 17 */                    return ((i000IO) obj).toString();
                        default:
/* 10 */                    return ((Callable) obj).toString();
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 13 */        public IOOoiII1ioO(IOOoo0o0Io iOOoo0o0Io, i000IO i000io, Executor executor) {
/* 15 */            this(iOOoo0o0Io, executor);
                    this.I00ilI0I1 = 0;
/* 14 */            this.I00ilO0 = iOOoo0o0Io;
/* 16 */            this.I00io1l = i000io;
                }

/* 16 */        public IOOoiII1ioO(IOOoo0o0Io iOOoo0o0Io, Executor executor) {
/* 17 */            this.I00iio = iOOoo0o0Io;
/* 19 */            this.I00iiO = executor;
                }
            }
