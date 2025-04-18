@RestController
@RequestMapping("/api/fleet")
public class FleetController {

    @Autowired
    private FleetService fleetService;

    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicles() {
        return fleetService.getAllVehicles();
    }

    @PostMapping("/vehicle")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return fleetService.saveVehicle(vehicle);
    }
}
