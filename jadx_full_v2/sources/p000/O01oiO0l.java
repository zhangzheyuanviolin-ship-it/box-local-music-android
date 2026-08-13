            package p000;
            
/* 24 */    public final class O01oiO0l implements OlI1ii {
                static final IIOIIi1ilIO STATE_C_STYLE_COMMENT;
                static final IIOIIi1ilIO STATE_DOUBLE_QUOTED;
                static final IIOIIi1ilIO STATE_END_OF_JSON;
                static final IIOIIi1ilIO STATE_END_OF_LINE_COMMENT;
                static final IIOIIi1ilIO STATE_JSON;
                static final IIOIIi1ilIO STATE_SINGLE_QUOTED;
                private final III1o0lOio0 buffer;
                private boolean closed;
                private long limit;
                private final III1o0lOio0 prefix;
                private final IIIIlO11I0lO source;
                private int stackSize;
                private IIOIIi1ilIO state;

                static {
/* 11 */            IIOIIi1ilIO iIOIIi1ilIO = new IIOIIi1ilIO("[]{}\"'/#".getBytes(IO1IOI.I00000oIO));
/* 14 */            iIOIIi1ilIO.I00iiO = "[]{}\"'/#";
/* 16 */            STATE_JSON = iIOIIi1ilIO;
/* 28 */            IIOIIi1ilIO iIOIIi1ilIO2 = new IIOIIi1ilIO("'\\".getBytes(IO1IOI.I00000oIO));
/* 31 */            iIOIIi1ilIO2.I00iiO = "'\\";
/* 33 */            STATE_SINGLE_QUOTED = iIOIIi1ilIO2;
/* 45 */            IIOIIi1ilIO iIOIIi1ilIO3 = new IIOIIi1ilIO("\"\\".getBytes(IO1IOI.I00000oIO));
/* 48 */            iIOIIi1ilIO3.I00iiO = "\"\\";
/* 50 */            STATE_DOUBLE_QUOTED = iIOIIi1ilIO3;
/* 62 */            IIOIIi1ilIO iIOIIi1ilIO4 = new IIOIIi1ilIO("\r\n".getBytes(IO1IOI.I00000oIO));
/* 65 */            iIOIIi1ilIO4.I00iiO = "\r\n";
/* 67 */            STATE_END_OF_LINE_COMMENT = iIOIIi1ilIO4;
/* 79 */            IIOIIi1ilIO iIOIIi1ilIO5 = new IIOIIi1ilIO("*".getBytes(IO1IOI.I00000oIO));
/* 82 */            iIOIIi1ilIO5.I00iiO = "*";
/* 84 */            STATE_C_STYLE_COMMENT = iIOIIi1ilIO5;
/* 88 */            STATE_END_OF_JSON = IIOIIi1ilIO.I00iio;
                }

                public O01oiO0l(IIIIlO11I0lO iIIIlO11I0lO, III1o0lOio0 iII1o0lOio0, IIOIIi1ilIO iIOIIi1ilIO, int i) {
/* 6 */             this.limit = 0L;
/* 9 */             this.closed = false;
/* 11 */            this.source = iIIIlO11I0lO;
/* 17 */            this.buffer = iIIIlO11I0lO.I0000oI00();
/* 19 */            this.prefix = iII1o0lOio0;
/* 21 */            this.state = iIOIIi1ilIO;
/* 23 */            this.stackSize = i;
                }

                private void advanceLimit(long j) {
                    while (true) {
/* 1 */                 long j2 = this.limit;
/* 5 */                 if (j2 >= j) {
/* 966 */                   return;
                        }
/* 7 */                 IIOIIi1ilIO iIOIIi1ilIO = this.state;
/* 9 */                 IIOIIi1ilIO iIOIIi1ilIO2 = STATE_END_OF_JSON;
/* 11 */                if (iIOIIi1ilIO == iIOIIi1ilIO2) {
/* 966 */                   return;
                        }
/* 23 */                if (j2 == this.buffer.I00iiI) {
/* 29 */                    if (j2 > 0) {
/* 966 */                       return;
                            } else {
/* 35 */                        this.source.I00100o1O0lo(1L);
                            }
                        }
/* 44 */                long jI00100l0 = this.buffer.I00100l0(this.state, this.limit);
/* 52 */                III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 54 */                if (jI00100l0 == -1) {
/* 58 */                    this.limit = iII1o0lOio0.I00iiI;
                        } else {
/* 61 */                    byte bI000O01llI0 = iII1o0lOio0.I000O01llI0(jI00100l0);
/* 65 */                    IIOIIi1ilIO iIOIIi1ilIO3 = this.state;
/* 67 */                    IIOIIi1ilIO iIOIIi1ilIO4 = STATE_JSON;
/* 73 */                    if (iIOIIi1ilIO3 == iIOIIi1ilIO4) {
/* 77 */                        if (bI000O01llI0 == 34) {
/* 190 */                           this.state = STATE_DOUBLE_QUOTED;
/* 193 */                           this.limit = jI00100l0 + 1;
                                } else if (bI000O01llI0 == 35) {
/* 181 */                           this.state = STATE_END_OF_LINE_COMMENT;
/* 184 */                           this.limit = jI00100l0 + 1;
                                } else if (bI000O01llI0 == 39) {
/* 172 */                           this.state = STATE_SINGLE_QUOTED;
/* 175 */                           this.limit = jI00100l0 + 1;
                                } else if (bI000O01llI0 != 47) {
/* 91 */                            if (bI000O01llI0 != 91) {
/* 95 */                                if (bI000O01llI0 != 93) {
/* 99 */                                    if (bI000O01llI0 != 123) {
/* 103 */                                       if (bI000O01llI0 != 125) {
                                                }
                                            }
                                        }
                                        int i = this.stackSize - 1;
/* 110 */                               this.stackSize = i;
/* 112 */                               if (i == 0) {
/* 114 */                                   this.state = iIOIIi1ilIO2;
                                        }
/* 117 */                               this.limit = jI00100l0 + 1;
                                    }
                                    this.stackSize++;
/* 127 */                           this.limit = jI00100l0 + 1;
                                } else {
/* 133 */                           long j3 = 2 + jI00100l0;
/* 134 */                           this.source.I00100o1O0lo(j3);
/* 139 */                           long j4 = jI00100l0 + 1;
/* 140 */                           byte bI000O01llI02 = this.buffer.I000O01llI0(j4);
/* 144 */                           if (bI000O01llI02 == 47) {
/* 148 */                               this.state = STATE_END_OF_LINE_COMMENT;
/* 150 */                               this.limit = j3;
                                    } else if (bI000O01llI02 == 42) {
/* 160 */                               this.state = STATE_C_STYLE_COMMENT;
/* 162 */                               this.limit = j3;
                                    } else {
/* 166 */                               this.limit = j4;
                                    }
                                }
                            } else if (iIOIIi1ilIO3 == STATE_SINGLE_QUOTED || iIOIIi1ilIO3 == STATE_DOUBLE_QUOTED) {
/* 252 */                       if (bI000O01llI0 == 92) {
/* 256 */                           long j5 = jI00100l0 + 2;
/* 257 */                           this.source.I00100o1O0lo(j5);
/* 260 */                           this.limit = j5;
                                } else {
/* 266 */                           if (this.stackSize > 0) {
/* 268 */                               iIOIIi1ilIO2 = iIOIIi1ilIO4;
                                    }
/* 269 */                           this.state = iIOIIi1ilIO2;
/* 272 */                           this.limit = jI00100l0 + 1;
                                }
                            } else if (iIOIIi1ilIO3 == STATE_C_STYLE_COMMENT) {
/* 212 */                       long j6 = 2 + jI00100l0;
/* 213 */                       this.source.I00100o1O0lo(j6);
/* 218 */                       long j7 = jI00100l0 + 1;
/* 223 */                       if (this.buffer.I000O01llI0(j7) == 47) {
/* 225 */                           this.limit = j6;
/* 227 */                           this.state = iIOIIi1ilIO4;
                                } else {
/* 231 */                           this.limit = j7;
                                }
                            } else if (iIOIIi1ilIO3 != STATE_END_OF_LINE_COMMENT) {
/* 246 */                       OoOil11Ol1o.I0000Il00O();
/* 249 */                       return;
                            } else {
/* 240 */                       this.limit = jI00100l0 + 1;
/* 242 */                       this.state = iIOIIi1ilIO4;
                            }
                        }
                    }
                }

                @Override
                public void close() {
/* 2 */             this.closed = true;
                }

                public void discard() {
/* 2 */             this.closed = true;
/* 8 */             while (this.state != STATE_END_OF_JSON) {
/* 12 */                advanceLimit(8192L);
/* 19 */                this.source.skip(this.limit);
                    }
                }

                @Override
                public long read(III1o0lOio0 iII1o0lOio0, long j) {
/* 5 */             if (this.closed) {
/* 86 */                I000II.I001IO000("closed");
/* 3 */                 return 0L;
                    }
/* 9 */             if (j == 0) {
/* 3 */                 return 0L;
                    }
/* 20 */            if (!this.prefix.I00II0Ol1O0l()) {
/* 24 */                long j2 = this.prefix.read(iII1o0lOio0, j);
/* 28 */                long j3 = j - j2;
/* 35 */                if (!this.buffer.I00II0Ol1O0l()) {
/* 38 */                    long j4 = read(iII1o0lOio0, j3);
/* 44 */                    if (j4 != -1) {
/* 46 */                        return j4 + j2;
                            }
                        }
/* 48 */                return j2;
                    }
/* 49 */            advanceLimit(j);
/* 52 */            long j5 = this.limit;
/* 56 */            if (j5 == 0) {
/* 62 */                if (this.state == STATE_END_OF_JSON) {
/* 18 */                    return -1L;
                        }
/* 65 */                OoOil11Ol1o.I0000Il00O();
/* 3 */                 return 0L;
                    }
/* 69 */            long jMin = Math.min(j, j5);
/* 75 */            iII1o0lOio0.write(this.buffer, jMin);
                    this.limit -= jMin;
/* 83 */            return jMin;
                }

                @Override
                public Oo11IoI timeout() {
/* 3 */             return this.source.timeout();
                }

/* 25 */        public O01oiO0l(IIIIlO11I0lO iIIIlO11I0lO) {
/* 28 */            this(iIIIlO11I0lO, new III1o0lOio0(), STATE_JSON, 0);
                }
            }
