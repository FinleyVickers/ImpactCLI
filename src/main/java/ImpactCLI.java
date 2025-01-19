import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(
        name = "impact",
        mixinStandardHelpOptions = true,
        version = "1.0",
        description = "A CLI demonstration for impact.com"
)
public class ImpactCLI implements Callable<Integer> {

    @Option(names = {"-c", "--color"}, description = "Use colored output")
    boolean color = false;

    @Option(names = {"-a", "--animate"}, description = "Show animated output")
    boolean animate = false;

    private static final String[] IMPACT_LOGO = {
            "  ___                            _                        ",
            " |_ _|_ __ ___  _ __   __ _  ___| |_   ___ ___  _ __ ___",
            "  | || '_ ` _ \\| '_ \\ / _` |/ __| __| / __/ _ \\| '_ ` _ \\",
            "  | || | | | | | |_) | (_| | (__| |_ | (_| (_) | | | | | |",
            " |___|_| |_| |_| .__/ \\__,_|\\___|\\__(_)___\\___/|_| |_| |_|",
            "                |_|                                         "
    };

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";

    @Override
    public Integer call() throws Exception {
        if (animate) {
            displayAnimated();
        } else {
            displayStatic();
        }
        return 0;
    }

    private void displayStatic() {
        for (String line : IMPACT_LOGO) {
            if (color) {
                System.out.println(ANSI_BLUE + line + ANSI_RESET);
            } else {
                System.out.println(line);
            }
        }
        System.out.println("\nPartnership Management Platform");
        System.out.println("Created by Finley Vickers for impact.com Co-op Application");
    }

    private void displayAnimated() throws InterruptedException {
        for (String line : IMPACT_LOGO) {
            if (color) {
                System.out.println(ANSI_BLUE + line + ANSI_RESET);
            } else {
                System.out.println(line);
            }
            Thread.sleep(100);
        }
        System.out.println("\nPartnership Management Platform");
        System.out.println("Created by Finley Vickers for impact.com Co-op Application");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ImpactCLI()).execute(args);
        System.exit(exitCode);
    }
}