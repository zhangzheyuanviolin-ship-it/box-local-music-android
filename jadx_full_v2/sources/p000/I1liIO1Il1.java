            package p000;
            
            public final class I1liIO1Il1 implements IIoOOiIO0o1I {
                public I1li0oll1lI1[] I00iOIl;

                public final void I00000oIO() {
/* 5 */             for (I1li0oll1lI1 i1li0oll1lI1 : this.I00iOIl) {
/* 9 */                 IiiOlIiio iiiOlIiio = i1li0oll1lI1.I00ilO0;
/* 11 */                if (iiiOlIiio == null) {
/* 21 */                    O0000Ioio00.I000OOo1O("handle");
/* 25 */                    throw null;
                        }
/* 13 */                iiiOlIiio.I00000oOI();
                    }
                }

                @Override
                public final void I00000oOI(Throwable th) {
/* 1 */             I00000oIO();
                }

                public final String toString() {
/* 18 */            return "DisposeHandlersOnCancel[" + this.I00iOIl + ']';
                }
            }
