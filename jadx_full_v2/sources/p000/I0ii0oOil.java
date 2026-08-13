            package p000;

            import java.util.Set;
            
            public final class I0ii0oOil extends iOIi0iO1OI1I {
                @Override
                public final void I00000oIO(IOOoo0o0Io iOOoo0o0Io, Set set) {
                    synchronized (iOOoo0o0Io) {
                        try {
/* 4 */                     if (iOOoo0o0Io.I00ioIO == null) {
/* 6 */                         iOOoo0o0Io.I00ioIO = set;
                            }
                        } catch (Throwable th) {
/* 89 */                    throw th;
                        }
                    }
                }

                @Override
                public final int I00000oOI(IOOoo0o0Io iOOoo0o0Io) {
                    int i;
                    synchronized (iOOoo0o0Io) {
                        i = iOOoo0o0Io.I00l0I0l0lO1 - 1;
/* 6 */                 iOOoo0o0Io.I00l0I0l0lO1 = i;
                    }
/* 9 */             return i;
                }
            }
