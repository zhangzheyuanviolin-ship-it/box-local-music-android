            package p000;

            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OlO1IoO implements Runnable {
                public static final Object I00ioIO = new Object();
                public Executor I00iOIl;
                public OIOiOllolii I00iiI;
                public AtomicBoolean I00iiO;
                public AtomicReference I00iio;
                public Object I00ilI0I1;
                public int I00ilO0;
                public boolean I00io1l;

                public final void I00000oIO(int i) {
                    synchronized (this) {
                        try {
/* 8 */                     if (this.I00iiO.get()) {
/* 16 */                        if (i <= this.I00ilO0) {
/* 19 */                            return;
                                }
/* 20 */                        this.I00ilO0 = i;
/* 24 */                        if (this.I00io1l) {
/* 27 */                            return;
                                }
/* 29 */                        this.I00io1l = true;
                                try {
/* 34 */                            this.I00iOIl.execute(this);
                                } catch (Throwable unused) {
                                    synchronized (this) {
/* 40 */                                this.I00io1l = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                @Override
                public final void run() {
                    synchronized (this) {
                        try {
/* 9 */                     if (!this.I00iiO.get()) {
/* 11 */                        this.I00io1l = false;
/* 14 */                        return;
                            }
/* 19 */                    Object obj = this.I00iio.get();
/* 23 */                    int i = this.I00ilO0;
                            while (true) {
/* 32 */                        if (!Objects.equals(this.I00ilI0I1, obj)) {
/* 34 */                            this.I00ilI0I1 = obj;
/* 36 */                            boolean z = obj instanceof I1lIo10011;
/* 38 */                            OIOiOllolii oIOiOllolii = this.I00iiI;
/* 40 */                            if (z) {
/* 47 */                                throw null;
                                    }
/* 42 */                            oIOiOllolii.I00000oIO(obj);
                                }
                                synchronized (this) {
                                    try {
/* 51 */                                if (i == this.I00ilO0 || !this.I00iiO.get()) {
                                            break;
                                        }
/* 64 */                                obj = this.I00iio.get();
/* 68 */                                i = this.I00ilO0;
                                    } finally {
                                    }
                                }
                            }
/* 74 */                    this.I00io1l = false;
                        } finally {
                        }
                    }
                }
            }
