            package p000;
            
            public final class I010l1O extends Throwable {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I010l1O(String str, int i) {
/* 3 */             super(str);
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final synchronized Throwable fillInStackTrace() {
                    switch (this.I00iOIl) {
                        case 0:
                            synchronized (this) {
                                break;
                            }
                        case 1:
                            synchronized (this) {
                                break;
                            }
                        case 2:
                            synchronized (this) {
                                break;
                            }
                        case 3:
                            synchronized (this) {
                                break;
                            }
                        default:
                            synchronized (this) {
                                break;
                            }
                    }
/* 8 */             return this;
                }
            }
