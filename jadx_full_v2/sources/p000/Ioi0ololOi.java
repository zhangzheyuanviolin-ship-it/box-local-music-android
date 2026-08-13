            package p000;

            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class Ioi0ololOi extends Ilioo0O0O {
                public final int I00iio;
                public Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ioi0ololOi(IoiO1IO1I1i ioiO1IO1I1i, int i) {
/* 6 */             super(ioiO1IO1I1i);
/* 1 */             this.I00iio = i;
                    switch (i) {
                        case 1:
/* 10 */                    super(ioiO1IO1I1i);
/* 19 */                    this.I00ilI0I1 = new AtomicBoolean(false);
                            break;
                        default:
                            break;
                    }
                }

                @Override
                public void close() throws Exception {
                    switch (this.I00iio) {
                        case 1:
/* 19 */                    if (!((AtomicBoolean) this.I00ilI0I1).getAndSet(true)) {
/* 21 */                        super.close();
                                break;
                            }
                            break;
                        default:
/* 6 */                     super.close();
                            break;
                    }
                }
            }
