            package p000;

            import java.io.Closeable;
            import java.io.Flushable;
            import java.io.IOException;
            import java.io.Writer;
            import java.util.Objects;
            
/* 15 */    public final class OlOl0Oi extends Writer {
                public final int I00iOIl;
                public final StringBuilder I00iiI;
                public final CharSequence I00iiO;

                public OlOl0Oi(int i, StringBuilder sb) {
/* 1 */             this.I00iOIl = i;
                    switch (i) {
                        case 1:
/* 29 */                    this.I00iiO = new OlOl0Il0IO1i(1);
/* 31 */                    this.I00iiI = sb;
                            break;
                        default:
/* 15 */                    this.I00iiO = new OlOl0Il0IO1i(0);
/* 17 */                    this.I00iiI = sb;
                            break;
                    }
                }

                @Override
                public final Writer append(CharSequence charSequence) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             StringBuilder sb = this.I00iiI;
                    switch (i) {
                        case 0:
/* 12 */                    sb.append(charSequence);
                            break;
                        default:
/* 8 */                     sb.append(charSequence);
                            break;
                    }
/* 11 */            return this;
                }

                @Override
                public final void close() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 7 */                     CharSequence charSequence = this.I00iiI;
/* 11 */                    if (charSequence instanceof Closeable) {
/* 15 */                        ((Closeable) charSequence).close();
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final void flush() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 7 */                     CharSequence charSequence = this.I00iiI;
/* 11 */                    if (charSequence instanceof Flushable) {
/* 15 */                        ((Flushable) charSequence).flush();
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final void write(char[] cArr, int i, int i2) {
/* 1 */             int i3 = this.I00iOIl;
/* 3 */             StringBuilder sb = this.I00iiI;
/* 6 */             CharSequence charSequence = this.I00iiO;
                    switch (i3) {
                        case 0:
/* 22 */                    OlOl0Il0IO1i olOl0Il0IO1i = (OlOl0Il0IO1i) charSequence;
/* 24 */                    olOl0Il0IO1i.I00iiI = cArr;
/* 26 */                    olOl0Il0IO1i.I00iiO = null;
/* 29 */                    sb.append((CharSequence) olOl0Il0IO1i, i, i2 + i);
                            break;
                        default:
/* 11 */                    OlOl0Il0IO1i olOl0Il0IO1i2 = (OlOl0Il0IO1i) charSequence;
/* 13 */                    olOl0Il0IO1i2.I00iiI = cArr;
/* 15 */                    olOl0Il0IO1i2.I00iiO = null;
/* 18 */                    sb.append((CharSequence) olOl0Il0IO1i2, i, i2 + i);
                            break;
                    }
                }

                @Override
/* 16 */        public final Appendable append(CharSequence charSequence) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    this.I00iiI.append(charSequence);
                            break;
                        default:
/* 17 */                    append(charSequence);
                            break;
                    }
                    return this;
                }

                @Override
/* 18 */        public final Writer append(CharSequence charSequence, int i, int i2) {
                    int i3 = this.I00iOIl;
                    StringBuilder sb = this.I00iiI;
                    switch (i3) {
                        case 0:
/* 20 */                    sb.append(charSequence, i, i2);
                            break;
                        default:
/* 19 */                    sb.append(charSequence, i, i2);
                            break;
                    }
                    return this;
                }

                @Override
/* 20 */        public final Appendable append(CharSequence charSequence, int i, int i2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    this.I00iiI.append(charSequence, i, i2);
                            break;
                        default:
/* 21 */                    append(charSequence, i, i2);
                            break;
                    }
                    return this;
                }

/* 28 */        private final void I00000oIO() {
                }

/* 28 */        private final void I0000Il00O() {
                }

                @Override
/* 32 */        public final void write(String str, int i, int i2) {
                    int i3 = this.I00iOIl;
                    StringBuilder sb = this.I00iiI;
                    switch (i3) {
                        case 0:
/* 35 */                    Objects.requireNonNull(str);
/* 36 */                    sb.append((CharSequence) str, i, i2 + i);
                            break;
                        default:
/* 33 */                    Objects.requireNonNull(str);
/* 34 */                    sb.append((CharSequence) str, i, i2 + i);
                            break;
                    }
                }

                @Override
/* 36 */        public final void write(int i) {
                    int i2 = this.I00iOIl;
                    StringBuilder sb = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 38 */                    sb.append((char) i);
                            break;
                        default:
/* 37 */                    sb.append((char) i);
                            break;
                    }
                }
            }
