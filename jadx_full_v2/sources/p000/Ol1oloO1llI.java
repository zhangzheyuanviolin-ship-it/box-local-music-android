            package p000;

            import java.io.IOException;
            import java.net.Socket;
            import java.net.SocketTimeoutException;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class Ol1oloO1llI extends I1Ool00ioI {
                public final Socket I000o00OoI0I;

                public Ol1oloO1llI(Socket socket) {
/* 4 */             this.I000o00OoI0I = socket;
                }

                @Override
                public final void I000OiO() throws IOException {
/* 3 */             Socket socket = this.I000o00OoI0I;
                    try {
/* 5 */                 socket.close();
                    } catch (AssertionError e) {
/* 10 */                Logger logger = i0I1O1oilI1.I00000oIO;
/* 16 */                if (e.getCause() != null) {
/* 18 */                    String message = e.getMessage();
/* 31 */                    if (message != null ? OlOoOIi0o.I000oI1ioi(message, "getsockname failed", false) : false) {
/* 49 */                        i0I1O1oilI1.I00000oIO.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
/* 113 */                       return;
                            }
                        }
/* 53 */                throw e;
                    } catch (Exception e2) {
/* 71 */                i0I1O1oilI1.I00000oIO.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                    }
                }

                public final IOException I000iOII(IOException iOException) {
/* 5 */             SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
/* 8 */             if (iOException != null) {
/* 10 */                socketTimeoutException.initCause(iOException);
                    }
/* 49 */            return socketTimeoutException;
                }
            }
