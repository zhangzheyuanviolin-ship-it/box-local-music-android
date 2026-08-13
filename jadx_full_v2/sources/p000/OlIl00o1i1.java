            package p000;
            
            public final class OlIl00o1i1 implements Ii011lOOlI1, IOoil1iiIilo {
                public static final OlIl00o1i1 I00iOIl = new OlIl00o1i1();

                @Override
                public final Ii011lOOlI1 getCallerFrame() {
/* 1 */             return null;
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             return Il00o11.I00iOIl;
                }

                @Override
                public final void resumeWith(Object obj) {
/* 49 */            throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
                }
            }
